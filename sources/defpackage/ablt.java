package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ablt {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final ffix e;
    public final ffix f;
    public final int g;

    public ablt(String str, String str2, String str3, boolean z, int i, ffix ffixVar, ffix ffixVar2) {
        str.getClass();
        if (i == 0) {
            throw null;
        }
        ffixVar.getClass();
        ffixVar2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.g = i;
        this.e = ffixVar;
        this.f = ffixVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ablt)) {
            return false;
        }
        ablt abltVar = (ablt) obj;
        return ffkj.e(this.a, abltVar.a) && ffkj.e(this.b, abltVar.b) && ffkj.e(this.c, abltVar.c) && this.d == abltVar.d && this.g == abltVar.g && ffkj.e(this.e, abltVar.e) && ffkj.e(this.f, abltVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return (((((((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.g) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnackbarUiData(id=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", actionLabel=");
        sb.append(this.c);
        sb.append(", withDismissAction=");
        sb.append(this.d);
        sb.append(", duration=");
        int i = this.g;
        sb.append((Object) (i != 1 ? i != 2 ? "Indefinite" : "Long" : "Short"));
        sb.append(", onDismissed=");
        sb.append(this.e);
        sb.append(", onActionPerformed=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ ablt(String str, String str2, boolean z, int i, ffix ffixVar, int i2) {
        this((i2 & 1) != 0 ? UUID.randomUUID().toString() : null, str, (i2 & 4) != 0 ? null : str2, ((i2 & 8) == 0) & z, (i2 & 16) != 0 ? 1 : i, (i2 & 32) != 0 ? new ffix() { // from class: ablr
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : null, (i2 & 64) != 0 ? new ffix() { // from class: abls
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar);
    }
}
