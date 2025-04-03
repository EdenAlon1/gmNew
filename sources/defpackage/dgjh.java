package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum dgjh implements dgim {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);

    public final int h;

    dgjh(int i2) {
        this.h = i2;
    }

    @Override // defpackage.dgim
    public final int a() {
        return this.h;
    }
}
