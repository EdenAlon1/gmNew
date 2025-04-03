package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avzc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ awai b;
    final /* synthetic */ awap c;
    final /* synthetic */ avzh d;
    final /* synthetic */ awat e;
    final /* synthetic */ awbj f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avzc(ffgu ffguVar, awai awaiVar, awap awapVar, avzh avzhVar, awat awatVar, awbj awbjVar) {
        super(2, ffguVar);
        this.b = awaiVar;
        this.c = awapVar;
        this.d = avzhVar;
        this.e = awatVar;
        this.f = awbjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avzc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        emyg emygVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            emygVar = (emyg) this.g;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            awat awatVar = this.e;
            awai awaiVar = this.b;
            awbj awbjVar = this.f;
            emyg b = emyg.b();
            this.g = b;
            this.a = 1;
            obj = awatVar.f(awaiVar, awbjVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            emygVar = b;
        }
        ernm ernmVar = new ernm((awbn) obj, emygVar.d());
        Object obj2 = ernmVar.a;
        this.b.e.d = ernmVar.b;
        ensk h = avzh.a.h();
        h.Y(ente.a, "BugleFileTransfer");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(cqpo.j, this.c);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor$startPipeline$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 189, "FileTransferProcessor.kt")).q("Finished processing pipeline for processing id.");
        if (((atwv) this.d.i.b()).a()) {
            avzh avzhVar = this.d;
            ffhe ffheVar = ffhe.a;
            ffsm ffsmVar = ffsm.a;
            ffra.b(avzhVar.b, ekxi.a(ffheVar), ffsmVar, new avzd(null, this.d, this.c, this.b));
        }
        if (this.e.i()) {
            ensk h2 = avzh.a.h();
            h2.Y(ente.a, "BugleFileTransfer");
            enrr enrrVar2 = (enrr) h2;
            enrrVar2.Y(cqpo.j, this.c);
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor$startPipeline$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 216, "FileTransferProcessor.kt")).q("Pipeline is paused. Keeping it in the inProgressFileTransferMap.");
            return obj2;
        }
        avzh avzhVar2 = this.d;
        awan awanVar = (awan) avzhVar2.f.remove(this.c);
        if (awanVar != null) {
            ensk h3 = avzh.a.h();
            h3.Y(ente.a, "BugleFileTransfer");
            enrr enrrVar3 = (enrr) h3;
            enrrVar3.Y(cqpo.j, this.c);
            ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor$startPipeline$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 223, "FileTransferProcessor.kt")).t("Removed processing pipeline from the inProgressFileTransferMap. isCancelled=%s", Boolean.valueOf(awanVar.a.h()));
        }
        return obj2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        avzc avzcVar = new avzc(ffguVar, this.b, this.c, this.d, this.e, this.f);
        avzcVar.g = obj;
        return avzcVar;
    }
}
