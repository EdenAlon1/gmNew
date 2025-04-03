package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjgg extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ atlz c;
    final /* synthetic */ axbh d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjgg(atlz atlzVar, axbh axbhVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = atlzVar;
        this.d = axbhVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cjgg cjggVar = new cjgg(this.c, this.d, (ffgu) obj3);
        cjggVar.e = (cjgk) obj;
        cjggVar.b = (ceuw) obj2;
        return cjggVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [ceuw, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        if (i == 0) {
            ffci.b(obj);
            Object obj2 = this.e;
            ?? r9 = this.b;
            axbh axbhVar = this.d;
            ckkm ckkmVar = (ckkm) ckkn.a.createBuilder();
            ckkmVar.getClass();
            cjgk cjgkVar = (cjgk) obj2;
            ckkp ckkpVar = cjgkVar.f;
            if (ckkpVar == null) {
                ckkpVar = ckkp.a;
            }
            ckkpVar.getClass();
            ckko ckkoVar = (ckko) ckkpVar.toBuilder();
            ckkoVar.getClass();
            eyfy build = ckkoVar.build();
            build.getClass();
            ckkmVar.copyOnWrite();
            ckkn ckknVar = (ckkn) ckkmVar.instance;
            ckknVar.c = (ckkp) build;
            ckknVar.b = 11;
            eyfy build2 = ckkmVar.build();
            build2.getClass();
            ckkn ckknVar2 = (ckkn) build2;
            awui awuiVar = cjgkVar.d;
            if (awuiVar == null) {
                awuiVar = awui.a;
            }
            awui awuiVar2 = awuiVar;
            awuiVar2.getClass();
            awui awuiVar3 = cjgkVar.c;
            if (awuiVar3 == null) {
                awuiVar3 = awui.a;
            }
            awui awuiVar4 = awuiVar3;
            awuiVar4.getClass();
            boolean z = cjgkVar.e;
            awxv awxvVar = (awxv) awya.a.createBuilder();
            awxvVar.getClass();
            awyb.c(awxz.CONTROL, awxvVar);
            awyb.b(awxx.HIGH, awxvVar);
            awyb.d(awxvVar);
            ffhd ffhdVar = axbhVar.b;
            awya a = awyb.a(awxvVar);
            ffhd a2 = ekxi.a(ffhdVar);
            cjgf cjgfVar = new cjgf(null, axbhVar, awuiVar2, ckknVar2, awuiVar4, a, z, r9);
            this.e = null;
            this.a = 2;
            obj = ffra.a(a2, cjgfVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        } else {
            if (i == 1) {
                axbh axbhVar2 = (axbh) this.b;
                ceuw ceuwVar = (ceuw) this.e;
                try {
                    ffci.b(obj);
                    return axbhVar2.b((ckbx) obj, ceuwVar);
                } catch (Exception e) {
                    ((enrr) ((enrr) axbh.a.j()).g(e).h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler", "handleWorkForDestination", 119, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send failed.");
                    return ceyt.k();
                }
            }
            ffci.b(obj);
        }
        return (ceyt) obj;
    }
}
