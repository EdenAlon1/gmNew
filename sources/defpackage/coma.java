package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class coma extends comv {
    public final comb a;
    public final Optional b;
    public final eyhs c;
    public final Optional d;
    public final Optional e;
    public final boolean f;

    public coma(comb combVar, Optional optional, eyhs eyhsVar, Optional optional2, Optional optional3, boolean z) {
        this.a = combVar;
        this.b = optional;
        this.c = eyhsVar;
        this.d = optional2;
        this.e = optional3;
        this.f = z;
    }

    @Override // defpackage.comv
    public final comb a() {
        return this.a;
    }

    @Override // defpackage.comv
    public final Optional b() {
        return this.b;
    }

    public final String toString() {
        Optional optional = this.e;
        Optional optional2 = this.d;
        eyhs eyhsVar = this.c;
        Optional optional3 = this.b;
        return "SettingsStoreConfig{key=" + this.a.toString() + ", subKey=" + String.valueOf(optional3) + ", schema=" + eyhsVar.toString() + ", migration=" + String.valueOf(optional2) + ", invalidProtocolBufferException=" + String.valueOf(optional) + ", enableCache=" + this.f + "}";
    }
}
