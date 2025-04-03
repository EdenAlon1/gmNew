package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aivn implements ellh {
    final /* synthetic */ aivm a;

    public aivn(aivm aivmVar) {
        this.a = aivmVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        aivm aivmVar = this.a;
        emxf.l(((Optional) aivmVar.c.b()).isPresent());
        aivc aivcVar = (aivc) ((Optional) aivmVar.c.b()).get();
        eg egVar = aivmVar.a;
        bcse bcseVar = aivmVar.h;
        bcseVar.getClass();
        aivcVar.a((aivb) ellfVar, egVar, bcseVar);
        return elli.a;
    }
}
