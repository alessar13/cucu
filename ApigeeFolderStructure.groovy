folder('Development') {
    displayName('Development')
    description('Folder for Development')
}

folder('Development/APIGEE') {
    displayName('APIGEE')
    description('Folder for project APIGEE')
}

    folder('Development/APIGEE/NON-PROD') {
        description('Folder containing non-prod jobs for Apigee')
    }

        folder('Development/APIGEE/NON-PROD/proxies') {
            description('Folder containing non-prod jobs for Apigee')
        }

            folder('Development/APIGEE/NON-PROD/proxies/v1') {
                description('Folder containing v1 jobs for Apigee')
            }

                folder('Development/APIGEE/NON-PROD/proxies/v1/ecom-branches-proxy') {
                    description('Folder containing ecom-branches-proxy job')
                }

                    folder('Development/APIGEE/NON-PROD/proxies/v1/ecom-branches-proxy/dev') {
                        description('Folder containing ecom-branches-proxy job on dev env')
                    }

                    folder('Development/APIGEE/NON-PROD/proxies/v1/ecom-branches-proxy/pre-prod') {
                        description('Folder containing ecom-branches-proxy job on pre-prod env')
                    }

                    folder('Development/APIGEE/NON-PROD/proxies/v1/ecom-branches-proxy/qa') {
                        description('Folder containing ecom-branches-proxy job on qa env')
                    }

    folder('Development/APIGEE/NON-PROD/shared-flows') {
        description('Folder containing non-prod jobs for Apigee')
    }

        folder('Development/APIGEE/NON-PROD/shared-flows/v1') {
            description('Folder containing non-prod shared flows for Apigee')
        }

            folder('Development/APIGEE/NON-PROD/shared-flows/v1/default-fault') {
                description('Folder containing shared flow')
            }
                folder('Development/APIGEE/NON-PROD/shared-flows/v1/default-fault/dev') {
                    description('Folder containing shared flow')
                }
                folder('Development/APIGEE/NON-PROD/shared-flows/v1/default-fault/pre-prod') {
                    description('Folder containing shared flow')
                }
                folder('Development/APIGEE/NON-PROD/shared-flows/v1/default-fault/qa') {
                    description('Folder containing shared flow')
                }

            folder('Development/APIGEE/NON-PROD/shared-flows/v1/proxy-fault') {
                description('Folder containing shared flow')
            }
                folder('Development/APIGEE/NON-PROD/shared-flows/v1/proxy-fault/dev') {
                    description('Folder containing shared flow')
                }
                folder('Development/APIGEE/NON-PROD/shared-flows/v1/proxy-fault/pre-prod') {
                    description('Folder containing shared flow')
                }
                folder('Development/APIGEE/NON-PROD/shared-flows/v1/proxy-fault/qa') {
                    description('Folder containing shared flow')
                }

            folder('Development/APIGEE/NON-PROD/shared-flows/v1/target-fault') {
                description('Folder containing shared flow')
            }
                folder('Development/APIGEE/NON-PROD/shared-flows/v1/target-fault/dev') {
                    description('Folder containing shared flow')
                }
                folder('Development/APIGEE/NON-PROD/shared-flows/v1/target-fault/pre-prod') {
                    description('Folder containing shared flow')
                }
                folder('Development/APIGEE/NON-PROD/shared-flows/v1/target-fault/qa') {
                    description('Folder containing shared flow')
                }

folder('Development/APIGEE/PROD') {
    description('Folder containing prod jobs for Apigee')
}

    folder('Development/APIGEE/PROD/proxies') {
        description('Folder containing prod jobs for Apigee')
    }
        folder('Development/APIGEE/PROD/proxies/v1') {
            description('Folder containing v1 jobs')
        }

    folder('Development/APIGEE/PROD/shared-flows') {
        description('Folder containing prod jobs for Apigee')
    }

        folder('Development/APIGEE/PROD/shared-flows/v1') {
            description('Folder containing v1 jobs')
        }
