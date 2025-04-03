package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eudi extends euec {
    public final eude a;
    public final BigInteger b;
    public final eujt c;
    public final Integer d;

    public eudi(eude eudeVar, BigInteger bigInteger, eujt eujtVar, Integer num) {
        this.a = eudeVar;
        this.b = bigInteger;
        this.c = eujtVar;
        this.d = num;
    }

    @Override // defpackage.etfs
    public final Integer a() {
        return this.d;
    }

    @Override // defpackage.euec
    public final eujt b() {
        return this.c;
    }
}
