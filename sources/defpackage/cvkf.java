package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvkf implements ffji {
    final /* synthetic */ Instant a;

    public cvkf(Instant instant) {
        this.a = instant;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cvjn cvjnVar = (cvjn) obj;
        cvjnVar.getClass();
        cvjm cvjmVar = (cvjm) cvjnVar.toBuilder();
        Instant instant = this.a;
        if (instant == null) {
            cvjmVar.copyOnWrite();
            cvjn cvjnVar2 = (cvjn) cvjmVar.instance;
            cvjnVar2.j = null;
            cvjnVar2.b &= -65;
        } else {
            eyja b = eykn.b(instant);
            cvjmVar.copyOnWrite();
            cvjn cvjnVar3 = (cvjn) cvjmVar.instance;
            cvjnVar3.j = b;
            cvjnVar3.b |= 64;
        }
        eyfy build = cvjmVar.build();
        build.getClass();
        return (cvjn) build;
    }
}
