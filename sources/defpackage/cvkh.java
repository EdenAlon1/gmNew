package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvkh implements ffji {
    final /* synthetic */ Instant a;
    final /* synthetic */ enip b;

    public cvkh(Instant instant, enip enipVar) {
        this.a = instant;
        this.b = enipVar;
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
            cvjnVar2.h = null;
            cvjnVar2.b &= -33;
        } else {
            eyja b = eykn.b(instant);
            cvjmVar.copyOnWrite();
            cvjn cvjnVar3 = (cvjn) cvjmVar.instance;
            cvjnVar3.h = b;
            cvjnVar3.b |= 32;
        }
        enip enipVar = this.b;
        cvjmVar.copyOnWrite();
        ((cvjn) cvjmVar.instance).i = eyfy.emptyProtobufList();
        if (!enipVar.isEmpty()) {
            cvjmVar.copyOnWrite();
            cvjn cvjnVar4 = (cvjn) cvjmVar.instance;
            eygr eygrVar = cvjnVar4.i;
            if (!eygrVar.c()) {
                cvjnVar4.i = eyfy.mutableCopy(eygrVar);
            }
            eydl.addAll(enipVar, cvjnVar4.i);
        }
        eyfy build = cvjmVar.build();
        build.getClass();
        return (cvjn) build;
    }
}
