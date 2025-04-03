package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.android.vcard.VCardConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fanw {
    public final HashMap a = new HashMap();
    public final fanu b;
    public final KeyPair c;
    public byte[] d;
    public byte[] e;
    public int f;
    private PublicKey g;
    private SecretKey h;
    private byte[] i;

    public fanw(fanu fanuVar) {
        if (fanuVar == null) {
            n("Invalid handshake cipher");
        }
        this.b = fanuVar;
        this.f = 4;
        if (fanuVar.ordinal() == 0) {
            this.c = faoq.b();
        } else {
            k("unknown cipher: ".concat(String.valueOf(String.valueOf(fanuVar))));
            throw new AssertionError();
        }
    }

    public static byte[] e() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.security.PublicKey i(byte[] r5) {
        /*
            r4 = this;
            faow r0 = defpackage.faow.a     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
            eyfy r5 = defpackage.eyfy.parseFrom(r0, r5)     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
            faow r5 = (defpackage.faow) r5     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
            int r0 = r5.b     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
            r1 = r0 & 1
            if (r1 == 0) goto L63
            int r1 = r5.c     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
            int r1 = defpackage.faoy.a(r1)     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
            r2 = 2
            r3 = 1
            if (r1 != 0) goto L19
            goto L3b
        L19:
            if (r1 == r3) goto L3b
            if (r1 == r2) goto L2c
            r0 = r0 & 8
            if (r0 == 0) goto L49
            faos r5 = r5.f     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
            if (r5 != 0) goto L27
            faos r5 = defpackage.faos.a     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
        L27:
            javax.crypto.interfaces.DHPublicKey r5 = defpackage.faoq.e(r5)     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
            return r5
        L2c:
            r0 = r0 & 4
            if (r0 == 0) goto L49
            fapa r5 = r5.e     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
            if (r5 != 0) goto L36
            fapa r5 = defpackage.fapa.a     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
        L36:
            java.security.interfaces.RSAPublicKey r5 = defpackage.faoq.d(r5)     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
            return r5
        L3b:
            r0 = r0 & r2
            if (r0 == 0) goto L49
            faou r5 = r5.d     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
            if (r5 != 0) goto L44
            faou r5 = defpackage.faou.a     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
        L44:
            java.security.interfaces.ECPublicKey r5 = defpackage.faoq.c(r5)     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
            return r5
        L49:
            java.security.spec.InvalidKeySpecException r0 = new java.security.spec.InvalidKeySpecException     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
            int r5 = r5.c     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
            int r5 = defpackage.faoy.a(r5)     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
            if (r5 != 0) goto L54
            goto L55
        L54:
            r3 = r5
        L55:
            java.lang.String r5 = java.lang.Integer.toString(r3)     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
            java.lang.String r1 = "key object is missing for key type: "
            java.lang.String r5 = r1.concat(r5)     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
            r0.<init>(r5)     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
            throw r0     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
        L63:
            java.security.spec.InvalidKeySpecException r5 = new java.security.spec.InvalidKeySpecException     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
            java.lang.String r0 = "GenericPublicKey.type is a required field"
            r5.<init>(r0)     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
            throw r5     // Catch: java.security.spec.InvalidKeySpecException -> L6b defpackage.eygu -> L6d
        L6b:
            r5 = move-exception
            goto L6e
        L6d:
            r5 = move-exception
        L6e:
            java.lang.String r5 = r5.getMessage()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "Cannot parse public key: "
            java.lang.String r5 = r0.concat(r5)
            r0 = 104(0x68, float:1.46E-43)
            r4.o(r0, r5)
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fanw.i(byte[]):java.security.PublicKey");
    }

    private final void j(Exception exc) {
        this.f = 11;
        throw new fans(exc);
    }

    private final void k(String str) {
        this.f = 11;
        throw new fans(str);
    }

    private final void l(String str, Exception exc) {
        this.f = 11;
        throw new fans(str, exc);
    }

    private final void m(faom faomVar) {
        faoa faoaVar;
        if ((faomVar.b & 2) != 0) {
            try {
                faoaVar = (faoa) eyfy.parseFrom(faoa.a, faomVar.d);
            } catch (eygu e) {
                l("Cannot parse alert message", e);
                faoaVar = null;
            }
            int i = faoaVar.b;
            if ((i & 1) != 0) {
                if ((i & 2) != 0) {
                    int a = fany.a(faoaVar.c);
                    k("Received Alert message. Type: " + Integer.toString(a != 0 ? a : 1) + " Error Message: " + faoaVar.d);
                } else {
                    int a2 = fany.a(faoaVar.c);
                    k("Received Alert message. Type: ".concat(Integer.toString(a2 != 0 ? a2 : 1)));
                }
            }
        }
        k("Received empty Alert Message");
    }

    private final void n(String str) {
        this.f = 11;
        throw new IllegalArgumentException(str);
    }

    private final void o(int i, String str) {
        this.f = 11;
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            switch (i) {
                case VCardConstants.DEFAULT_PREF /* 100 */:
                case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                case 102:
                case 103:
                case 104:
                    break;
                default:
                    k("Unknown alert type: ".concat(Integer.toString(i)));
                    break;
            }
        }
        fanz fanzVar = (fanz) faoa.a.createBuilder();
        fanzVar.copyOnWrite();
        faoa faoaVar = (faoa) fanzVar.instance;
        faoaVar.c = i;
        faoaVar.b |= 1;
        fanzVar.copyOnWrite();
        faoa faoaVar2 = (faoa) fanzVar.instance;
        faoaVar2.b = 2 | faoaVar2.b;
        faoaVar2.d = str;
        throw new fant(str, (faoa) fanzVar.build());
    }

    public final fano a() {
        byte[] bArr;
        SecretKeySpec secretKeySpec;
        Exception e;
        SecretKey secretKey;
        int i = this.f;
        int i2 = i - 1;
        SecretKey secretKey2 = null;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 6:
                c("Handshake not verified, cannot create context");
                throw new AssertionError();
            case 7:
            default:
                c("Handshake is not complete; cannot create connection context");
                break;
            case 8:
                break;
            case 9:
                c("Cannot reuse handshake context; is has already been used");
                throw new AssertionError();
            case 10:
                c("Cannot make context; handshake had error");
                throw new AssertionError();
        }
        if (this.h == null) {
            c("Unexpected state error: derived key is null");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.d);
            byteArrayOutputStream.write(this.e);
        } catch (IOException e2) {
            j(e2);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            bArr = "UKEY2 v1 next".getBytes("UTF-8");
        } catch (UnsupportedEncodingException e3) {
            j(e3);
            bArr = null;
        }
        try {
            secretKeySpec = new SecretKeySpec(faop.a(this.h, bArr, byteArray), "AES");
        } catch (InvalidKeyException | NoSuchAlgorithmException e4) {
            j(e4);
            secretKeySpec = null;
        }
        try {
            secretKey = fanq.a(secretKeySpec, "client");
            try {
                secretKey2 = fanq.a(secretKeySpec, "server");
            } catch (InvalidKeyException e5) {
                e = e5;
                j(e);
                this.f = 10;
                return new fanp(secretKey2, secretKey);
            } catch (NoSuchAlgorithmException e6) {
                e = e6;
                j(e);
                this.f = 10;
                return new fanp(secretKey2, secretKey);
            }
        } catch (InvalidKeyException | NoSuchAlgorithmException e7) {
            e = e7;
            secretKey = null;
        }
        this.f = 10;
        return new fanp(secretKey2, secretKey);
    }

    public final void b(byte[] bArr) {
        faom faomVar;
        faoo faooVar;
        faom faomVar2;
        int a;
        faom faomVar3;
        byte[] f;
        int i = this.f;
        int i2 = i - 1;
        fanu fanuVar = null;
        faoc faocVar = null;
        faog faogVar = null;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            try {
                faomVar = (faom) eyfy.parseFrom(faom.a, bArr);
            } catch (eygu e) {
                o(1, "Can't parse message 2 ".concat(String.valueOf(e.getMessage())));
                faomVar = null;
            }
            if ((faomVar.b & 1) == 0) {
                o(2, "Expected, but did not find message type");
            }
            int a2 = faol.a(faomVar.c);
            if (a2 != 0 && a2 == 2) {
                this.f = 11;
                m(faomVar);
            }
            int a3 = faol.a(faomVar.c);
            if (a3 == 0 || a3 != 4) {
                o(2, "Expected, but did not find SERVER_INIT message type");
            }
            if ((faomVar.b & 2) == 0) {
                o(4, "Expected message data, but didn't find it");
            }
            try {
                faooVar = (faoo) eyfy.parseFrom(faoo.a, faomVar.d);
            } catch (eygu unused) {
                o(4, "Can't parse message data into ServerInit");
                faooVar = null;
            }
            if ((faooVar.b & 1) == 0) {
                o(100, "ServerInit missing version");
            }
            if (faooVar.c != 1) {
                o(100, "ServerInit version mismatch");
            }
            if ((faooVar.b & 2) == 0) {
                o(EnergyProfile.EVCONNECTOR_TYPE_OTHER, "ServerInit missing random");
            }
            if (faooVar.d.I().length != 32) {
                o(EnergyProfile.EVCONNECTOR_TYPE_OTHER, "ServerInit has incorrect nonce length");
            }
            if ((faooVar.b & 4) == 0) {
                o(102, "No handshake cipher found");
            }
            fanu[] values = fanu.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                fanu fanuVar2 = values[i3];
                int i4 = fanuVar2.b;
                int a4 = faoi.a(faooVar.e);
                if (a4 == 0) {
                    a4 = 1;
                }
                if (i4 == a4) {
                    fanuVar = fanuVar2;
                    break;
                }
                i3++;
            }
            if (fanuVar == null || fanuVar != this.b) {
                o(102, "No acceptable handshake cipher found");
            }
            if ((faooVar.b & 8) == 0) {
                o(104, "No public key found in ServerInit");
            }
            this.g = i(faooVar.f.I());
            this.e = bArr;
            this.f = 3;
            return;
        }
        if (i2 != 3) {
            if (i2 != 5) {
                c("Cannot parse message in state ".concat(fanv.a(i)));
                return;
            }
            try {
                faomVar3 = (faom) eyfy.parseFrom(faom.a, bArr);
            } catch (eygu e2) {
                l("Can't parse message 3", e2);
                faomVar3 = null;
            }
            if ((faomVar3.b & 1) == 0) {
                throw new fans("Expected, but did not find message type");
            }
            int a5 = faol.a(faomVar3.c);
            if (a5 != 0 && a5 == 2) {
                m(faomVar3);
            }
            int a6 = faol.a(faomVar3.c);
            if (a6 == 0 || a6 != 5) {
                k("Expected, but did not find CLIENT_FINISH message type");
            }
            if (this.b.ordinal() != 0) {
                c("Unexpected handshakeCipher");
                f = null;
            } else {
                f = f(bArr);
            }
            if (!MessageDigest.isEqual(f, this.i)) {
                k("Commitment does not match");
            }
            if ((faomVar3.b & 2) == 0) {
                k("Expected message data, but didn't find it");
            }
            try {
                faocVar = (faoc) eyfy.parseFrom(faoc.a, faomVar3.d);
            } catch (eygu e3) {
                j(e3);
            }
            if ((faocVar.b & 1) == 0) {
                k("No public key found in ClientFinished");
            }
            try {
                this.g = i(faocVar.c.I());
            } catch (fant e4) {
                j(e4);
            }
            this.f = 7;
            return;
        }
        try {
            faomVar2 = (faom) eyfy.parseFrom(faom.a, bArr);
        } catch (eygu e5) {
            o(1, "Can't parse message 1 ".concat(String.valueOf(e5.getMessage())));
            faomVar2 = null;
        }
        if ((faomVar2.b & 1) == 0 || (a = faol.a(faomVar2.c)) == 0 || a != 3) {
            o(2, "Expected, but did not find ClientInit message type");
        }
        if ((faomVar2.b & 2) == 0) {
            o(4, "Expected message data, but didn't find it");
        }
        try {
            faogVar = (faog) eyfy.parseFrom(faog.a, faomVar2.d);
        } catch (eygu unused2) {
            o(4, "Can't parse message data into ClientInit");
        }
        if ((faogVar.b & 1) == 0) {
            o(100, "ClientInit missing version");
        }
        if (faogVar.c != 1) {
            o(100, "ClientInit version mismatch");
        }
        if ((faogVar.b & 2) == 0) {
            o(EnergyProfile.EVCONNECTOR_TYPE_OTHER, "ClientInit missing random");
        }
        if (faogVar.d.I().length != 32) {
            o(EnergyProfile.EVCONNECTOR_TYPE_OTHER, "ClientInit has incorrect nonce length");
        }
        eygr<faof> eygrVar = faogVar.e;
        if (eygrVar.isEmpty()) {
            o(102, "ClientInit is missing cipher commitments");
        }
        for (faof faofVar : eygrVar) {
            int i5 = faofVar.b;
            if ((i5 & 1) == 0 || (i5 & 2) == 0) {
                o(102, "ClientInit has improperly formatted cipher commitment");
            }
            int a7 = faoi.a(faofVar.c);
            if (a7 == 0) {
                a7 = 1;
            }
            if (a7 == this.b.b) {
                this.i = faofVar.d.I();
            }
        }
        if (this.i == null) {
            o(102, "No acceptable commitments found");
        }
        if ((faogVar.b & 4) == 0 || !"AES_256_CBC-HMAC_SHA256".equals(faogVar.f)) {
            o(103, "Incorrect next protocol");
        }
        this.d = bArr;
        this.f = 5;
    }

    public final void c(String str) {
        this.f = 11;
        throw new IllegalStateException(str);
    }

    public final void d() {
        int i = this.f;
        if (i != 8) {
            c("Unexpected state: ".concat(fanv.a(i)));
        }
        this.f = 9;
    }

    public final byte[] f(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-512").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            l("No security provider initialized yet?", e);
            throw new AssertionError();
        }
    }

    public final byte[] g() {
        byte[] bArr;
        int i = this.f;
        if (i != 7) {
            c("Unexpected state: ".concat(fanv.a(i)));
        }
        try {
            this.h = fanr.a(this.c.getPrivate(), this.g);
        } catch (InvalidKeyException e) {
            j(e);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.d);
            byteArrayOutputStream.write(this.e);
        } catch (IOException e2) {
            j(e2);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr2 = null;
        try {
            bArr = "UKEY2 v1 auth".getBytes("UTF-8");
        } catch (UnsupportedEncodingException e3) {
            j(e3);
            bArr = null;
        }
        try {
            bArr2 = faop.a(this.h, bArr, byteArray);
        } catch (InvalidKeyException | NoSuchAlgorithmException e4) {
            j(e4);
        }
        this.f = 8;
        return Arrays.copyOf(bArr2, 32);
    }

    public final byte[] h(int i, byte[] bArr) {
        faoj faojVar = (faoj) faom.a.createBuilder();
        faojVar.copyOnWrite();
        faom faomVar = (faom) faojVar.instance;
        faomVar.c = i - 1;
        faomVar.b |= 1;
        if (bArr.length == 0) {
            n("Cannot send empty message data for non-alert messages");
        }
        eyee x = eyee.x(bArr);
        faojVar.copyOnWrite();
        faom faomVar2 = (faom) faojVar.instance;
        faomVar2.b |= 2;
        faomVar2.d = x;
        return ((faom) faojVar.build()).toByteArray();
    }
}
