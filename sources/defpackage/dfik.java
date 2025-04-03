package defpackage;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertPathValidator;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfik {
    public static dfik a;
    private final CertificateFactory b = c();

    public dfik() {
        byte[] bArr;
        b();
        try {
            bArr = "-----BEGIN CERTIFICATE-----\nMIIECDCCAvCgAwIBAgIBATANBgkqhkiG9w0BAQUFADB9MRgwFgYDVQQDEw9Qcml2YWN5IENBIFJvb3QxEjAQBgNVBAsTCUNocm9tZSBPUzETMBEGA1UEChMKR29vZ2xlIEluYzEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzETMBEGA1UECBMKQ2FsaWZvcm5pYTELMAkGA1UEBhMCVVMwHhcNMTMwMjE4MTAxMzQyWhcNMzMwMjEzMTAxMzQyWjB9MRgwFgYDVQQDEw9Qcml2YWN5IENBIFJvb3QxEjAQBgNVBAsTCUNocm9tZSBPUzETMBEGA1UEChMKR29vZ2xlIEluYzEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzETMBEGA1UECBMKQ2FsaWZvcm5pYTELMAkGA1UEBhMCVVMwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDhDqaBnT0Ga0Id12Et4+75WZ9dmiokv9CcqrVDURzyL2FeKfmJQlplc5a/M2A3R3Gc+wtCQM1oLHxVj+wBdrR5O+RAdSJGg2SPWxLQKoOKKo5VpLZF7QpKUrGSUqI9NL9koXrHEf6TqIkIbZQyEbF9Zw+WRCyfNn04AmAA2nlmTmAO6SWTSPT9dBCOlz1WHmJOn17ad6CFpusV+tssx3h8fzDvOxlvKkFqdvqesw1ldT9QOdl76nDoJDHSliOWo0hk8zt01gcH/qeUwDyC5UerwkB/p7rWe9Cc2rSbJuaHVJlNEqOEXb7O/+GN4NUfxvp4Z22J6h4Pz/kxWb+4CVGbAgMBAAGjgZIwgY8wKQYDVR0OBCIEIEsdFIqlOAk4gS7Wp2P13CwxhhDV+pYE1gnLLg2M7DKJMCsGA1UdIwQkMCKAIEsdFIqlOAk4gS7Wp2P13CwxhhDV+pYE1gnLLg2M7DKJMA4GA1UdDwEB/wQEAwIBBjAPBgNVHRMBAf8EBTADAQH/MBQGA1UdIAEB/wQKMAgwBgYEVR0gADANBgkqhkiG9w0BAQUFAAOCAQEAxA2EvI1gmxtos8qn6EECGDjX45JVfUDeurPgaF5ygFQQktyROwqmFQIo2P5asIzO77rFaVL6ALphQpTRuk+hcMhrJ/m/WGZsRpQPdAxL4nlVAbJeQLlwKvB8iEkmvYvu0DbFA+XkKiI/82JxQEykNgqT3skqAv2Nro91b8aKqmR+IVnwp6ldFEbpI2K9US9Z2uwCxdFSwwG5gH25mLpwxhY2R2KgpJeqqS632S82NRadP3TGQMc4lBdZqKtDZ3uAMp0BW9z4kit3moD4Xx5KZ3ZZxg3oAVLoxSan3kbKwUOnWvWPCAbegeFcl/YW4b/6HBxrDSQ4VDvfsqIb2bx65A==\n-----END CERTIFICATE-----".getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            Log.e("AttestationHelper", "Unable to decode root cert as utf-8");
            bArr = null;
        }
        X509Certificate a2 = bArr != null ? a(bArr) : null;
        if (a2 != null) {
            new TrustAnchor(a2, null);
        }
    }

    private static final void b() {
        try {
            CertPathValidator.getInstance("PKIX");
        } catch (NoSuchAlgorithmException e) {
            Log.e("AttestationHelper", "Could not obtain the cert path validator", e);
        }
    }

    private static final CertificateFactory c() {
        try {
            return CertificateFactory.getInstance("X.509");
        } catch (CertificateException e) {
            Log.e("AttestationHelper", "Could not obtain the certificate factory", e);
            return null;
        }
    }

    public final X509Certificate a(byte[] bArr) {
        CertificateFactory certificateFactory = this.b;
        if (certificateFactory == null) {
            Log.e("AttestationHelper", "No CertificateFactory available to generate an X.509 certificate");
            return null;
        }
        try {
            return (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
        } catch (CertificateException e) {
            Log.e("AttestationHelper", "Could not generate an X.509 certificate from: ".concat(new String(bArr, StandardCharsets.UTF_8)), e);
            return null;
        }
    }
}
