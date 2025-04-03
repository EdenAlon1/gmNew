package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wvj extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ wvr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvj(wvr wvrVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = wvrVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        wvj wvjVar = new wvj(this.d, (ffgu) obj4);
        wvjVar.a = (aaxe) obj;
        wvjVar.b = (xlw) obj2;
        wvjVar.c = (aqux) obj3;
        return wvjVar.b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [aqux, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        ?? r1 = this.c;
        wvr wvrVar = this.d;
        if (((Boolean) wvrVar.c.b()).booleanValue()) {
            aaxe aaxeVar = (aaxe) obj2;
            if (aaxeVar.a.size() == 1) {
                alxr alxrVar = (alxr) ffdx.T(aaxeVar.a);
                xlv xlvVar = obj3 instanceof xlv ? (xlv) obj3 : null;
                if (xlvVar == null || !xlvVar.m()) {
                    ensk h = wvr.a.h();
                    h.Y(ente.a, "BugleRcsEdits");
                    enrr enrrVar = (enrr) h;
                    enrrVar.Y(csux.c, alxrVar.b());
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation2/actions/editmessage/EditActionPlugin", "editActionUiData", 139, "EditActionPlugin.kt")).q("Not editable reason: conversation does not support edit");
                } else if (r1 != 0 && alxrVar.u(r1)) {
                    return wvrVar.c(alxrVar);
                }
            }
        }
        return null;
    }
}
