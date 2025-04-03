package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nio {
    public static nin a(byte[] bArr) {
        luv luvVar = new luv(bArr);
        if (luvVar.c < 32) {
            return null;
        }
        luvVar.K(0);
        int b = luvVar.b();
        int e = luvVar.e();
        if (e != b) {
            luj.f("PsshAtomUtil", a.r(b, e, "Advertised atom size (", ") does not match buffer size: "));
            return null;
        }
        int e2 = luvVar.e();
        if (e2 != 1886614376) {
            luj.f("PsshAtomUtil", a.h(e2, "Atom type is not pssh: "));
            return null;
        }
        int b2 = nhz.b(luvVar.e());
        if (b2 > 1) {
            luj.f("PsshAtomUtil", a.h(b2, "Unsupported pssh version: "));
            return null;
        }
        UUID uuid = new UUID(luvVar.q(), luvVar.q());
        if (b2 == 1) {
            int m = luvVar.m();
            UUID[] uuidArr = new UUID[m];
            for (int i = 0; i < m; i++) {
                uuidArr[i] = new UUID(luvVar.q(), luvVar.q());
            }
        }
        int m2 = luvVar.m();
        int b3 = luvVar.b();
        if (m2 != b3) {
            luj.f("PsshAtomUtil", a.r(b3, m2, "Atom data size (", ") does not match the bytes left: "));
            return null;
        }
        byte[] bArr2 = new byte[m2];
        luvVar.F(bArr2, 0, m2);
        return new nin(uuid, b2, bArr2);
    }

    public static byte[] b(byte[] bArr, UUID uuid) {
        nin a = a(bArr);
        if (a == null) {
            return null;
        }
        if (uuid.equals(a.a)) {
            return a.c;
        }
        luj.f("PsshAtomUtil", "UUID mismatch. Expected: " + uuid.toString() + ", got: " + a.a.toString() + ".");
        return null;
    }
}
