package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drlx {
    public static final enru a = enru.c("com/google/android/libraries/compose/media/MediaType");
    public final drlw b;
    public final String c;
    public final drlp d;
    private final ffbz e;

    public drlx(drlw drlwVar, String str, drlp drlpVar) {
        str.getClass();
        this.b = drlwVar;
        this.c = str;
        this.d = drlpVar;
        this.e = ffca.a(new ffix() { // from class: drln
            @Override // defpackage.ffix
            public final Object invoke() {
                StringBuilder sb = new StringBuilder();
                drlx drlxVar = drlx.this;
                sb.append(drlxVar.b.b() + "/" + drlxVar.c);
                drlp drlpVar2 = drlxVar.d;
                if (drlpVar2 != null) {
                    Objects.toString(drlpVar2);
                    sb.append(";".concat(drlpVar2.toString()));
                }
                return sb.toString();
            }
        });
    }

    public final String a() {
        return (String) this.e.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drlx)) {
            return false;
        }
        drlx drlxVar = (drlx) obj;
        return ffkj.e(this.b, drlxVar.b) && ffkj.e(this.c, drlxVar.c) && ffkj.e(this.d, drlxVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        drlp drlpVar = this.d;
        return (hashCode * 31) + (drlpVar == null ? 0 : drlpVar.hashCode());
    }

    public final String toString() {
        return a();
    }

    public /* synthetic */ drlx(drlw drlwVar, String str) {
        this(drlwVar, str, null);
    }
}
