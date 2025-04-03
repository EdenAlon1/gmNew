package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewvu extends ewze {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final ewyr d;
    private final engw e;

    public ewvu(boolean z, boolean z2, boolean z3, engw engwVar, ewyr ewyrVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.e = engwVar;
        this.d = ewyrVar;
    }

    @Override // defpackage.ewze
    public final engw a() {
        return this.e;
    }

    @Override // defpackage.ewze
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.ewze
    public final boolean c() {
        return this.a;
    }

    @Override // defpackage.ewze
    public final boolean d() {
        return this.c;
    }

    @Override // defpackage.ewze
    public final ewyr e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ewze) {
            ewze ewzeVar = (ewze) obj;
            if (this.a == ewzeVar.c() && this.b == ewzeVar.b()) {
                ewzeVar.f();
                if (this.c == ewzeVar.d()) {
                    ewzeVar.g();
                    ewzeVar.h();
                    ewzeVar.i();
                    if (enkr.h(this.e, ewzeVar.a()) && this.d.equals(ewzeVar.e())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ewyr ewyrVar = this.d;
        return "TextClassifierContactOptions{annotateName=" + this.a + ", annotateGivenName=" + this.b + ", annotateFamilyName=false, annotateNickname=" + this.c + ", enableChangeMonitoring=false, enableDeclension=false, enableShortcutContacts=false, shortcutContactNames=" + this.e.toString() + ", lightweightTokensProvider=" + ewyrVar.toString() + "}";
    }

    @Override // defpackage.ewze
    public final void f() {
    }

    @Override // defpackage.ewze
    public final void g() {
    }

    @Override // defpackage.ewze
    public final void h() {
    }

    @Override // defpackage.ewze
    public final void i() {
    }
}
