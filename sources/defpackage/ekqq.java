package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekqq extends ekqu {
    public final String a;
    public final engw b;
    public final eyhs c;
    public final ekqn d;
    public final Optional e;

    public ekqq(String str, engw engwVar, eyhs eyhsVar, ekqn ekqnVar, Optional optional) {
        this.a = str;
        this.b = engwVar;
        this.c = eyhsVar;
        this.d = ekqnVar;
        this.e = optional;
    }

    @Override // defpackage.ekqu
    public final ekqn a() {
        return this.d;
    }

    @Override // defpackage.ekqu
    public final engw b() {
        return this.b;
    }

    @Override // defpackage.ekqu
    public final eyhs c() {
        return this.c;
    }

    @Override // defpackage.ekqu
    public final Optional d() {
        return this.e;
    }

    @Override // defpackage.ekqu
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekqu) {
            ekqu ekquVar = (ekqu) obj;
            if (this.a.equals(ekquVar.e()) && enkr.h(this.b, ekquVar.b()) && this.c.equals(ekquVar.c()) && this.d.equals(ekquVar.a()) && this.e.equals(ekquVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Optional optional = this.e;
        ekqn ekqnVar = this.d;
        eyhs eyhsVar = this.c;
        return "DataStoreConfig{name=" + this.a + ", migrations=" + String.valueOf(this.b) + ", schema=" + eyhsVar.toString() + ", storage=" + ekqnVar.toString() + ", corruptionHandler=" + String.valueOf(optional) + "}";
    }
}
