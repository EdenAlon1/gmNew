package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyvt extends dywd {
    public final Uri a;
    public final engw b;
    public final String c;
    public final engw d;
    public final String e;
    public final int f;

    public dyvt(Uri uri, engw engwVar, String str, engw engwVar2, String str2, int i) {
        this.a = uri;
        this.b = engwVar;
        this.c = str;
        this.d = engwVar2;
        this.e = str2;
        this.f = i;
    }

    @Override // defpackage.dywd
    public final int a() {
        return this.f;
    }

    @Override // defpackage.dywd
    public final Uri b() {
        return this.a;
    }

    @Override // defpackage.dywd
    public final engw c() {
        return this.b;
    }

    @Override // defpackage.dywd
    public final engw d() {
        return this.d;
    }

    @Override // defpackage.dywd
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        engw engwVar;
        String str;
        engw engwVar2;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dywd) {
            dywd dywdVar = (dywd) obj;
            if (this.a.equals(dywdVar.b()) && ((engwVar = this.b) != null ? enkr.h(engwVar, dywdVar.c()) : dywdVar.c() == null) && ((str = this.c) != null ? str.equals(dywdVar.f()) : dywdVar.f() == null) && ((engwVar2 = this.d) != null ? enkr.h(engwVar2, dywdVar.d()) : dywdVar.d() == null) && ((str2 = this.e) != null ? str2.equals(dywdVar.e()) : dywdVar.e() == null)) {
                dywdVar.h();
                if (this.f == dywdVar.a()) {
                    dywdVar.i();
                    dywdVar.g();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dywd
    public final String f() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        engw engwVar = this.b;
        int hashCode2 = ((hashCode * 1000003) ^ (engwVar == null ? 0 : engwVar.hashCode())) * 1000003;
        String str = this.c;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        engw engwVar2 = this.d;
        int hashCode4 = (hashCode3 ^ (engwVar2 == null ? 0 : engwVar2.hashCode())) * 1000003;
        String str2 = this.e;
        return (((hashCode4 ^ (str2 != null ? str2.hashCode() : 0)) * (-721379959)) ^ this.f) * (-721379959);
    }

    public final String toString() {
        engw engwVar = this.d;
        engw engwVar2 = this.b;
        return "QueryParams{tableUri=" + this.a.toString() + ", projection=" + String.valueOf(engwVar2) + ", selection=" + this.c + ", selectionArgs=" + String.valueOf(engwVar) + ", orderBy=" + this.e + ", groupBy=null, limit=" + this.f + ", offset=0, filterPredicate=null}";
    }

    @Override // defpackage.dywd
    public final void g() {
    }

    @Override // defpackage.dywd
    public final void h() {
    }

    @Override // defpackage.dywd
    public final void i() {
    }
}
