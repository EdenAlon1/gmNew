package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsy implements Comparable {
    public static final jsy a;
    public static final jsy b;
    public static final jsy c;
    public static final jsy d;
    public static final jsy e;
    public static final jsy f;
    public static final jsy g;
    public static final jsy h;
    private static final jsy j;
    private static final jsy k;
    private static final jsy l;
    private static final jsy m;
    private static final jsy n;
    private static final jsy o;
    public final int i;

    static {
        jsy jsyVar = new jsy(100);
        j = jsyVar;
        jsy jsyVar2 = new jsy(BasePaymentResult.ERROR_REQUEST_FAILED);
        k = jsyVar2;
        jsy jsyVar3 = new jsy(300);
        l = jsyVar3;
        jsy jsyVar4 = new jsy(400);
        a = jsyVar4;
        jsy jsyVar5 = new jsy(500);
        b = jsyVar5;
        jsy jsyVar6 = new jsy(600);
        c = jsyVar6;
        jsy jsyVar7 = new jsy(700);
        m = jsyVar7;
        jsy jsyVar8 = new jsy(800);
        n = jsyVar8;
        jsy jsyVar9 = new jsy(900);
        o = jsyVar9;
        d = jsyVar3;
        e = jsyVar4;
        f = jsyVar5;
        g = jsyVar6;
        h = jsyVar7;
        ffdx.g(jsyVar, jsyVar2, jsyVar3, jsyVar4, jsyVar5, jsyVar6, jsyVar7, jsyVar8, jsyVar9);
    }

    public jsy(int i) {
        this.i = i;
        if (i <= 0 || i >= 1001) {
            jwo.b("Font weight can be in range [1, 1000]. Current value: " + i);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(jsy jsyVar) {
        return ffkj.a(this.i, jsyVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jsy) && this.i == ((jsy) obj).i;
    }

    public final int hashCode() {
        return this.i;
    }

    public final String toString() {
        return "FontWeight(weight=" + this.i + ')';
    }
}
