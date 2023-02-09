# vaultsetup


<h1>1. Start Vault server</h1>

This command starts up a server process.

$ vault server --dev --dev-root-token-id="00000000-0000-0000-0000-000000000000"

<h1>2. Set Environment Variables</h1>
$ export export VAULT_TOKEN="00000000-0000-0000-0000-000000000000"
$ export VAULT_ADDR="http://127.0.0.1:8200"

<h1>3. Store a configuration key-value pairs inside Vault</h1>

$ vault kv put secret/gs-vault-config example.username=demouser example.password=demopassword
$ vault kv put secret/gs-vault-config/cloud example.username=clouduser example.password=cloudpassword