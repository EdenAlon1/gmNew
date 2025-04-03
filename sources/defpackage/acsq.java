package defpackage;

import com.google.android.apps.messaging.dittosatellite.intent.DittoAttachment;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acsq extends ffhv implements ffjm {
    final /* synthetic */ DittoAttachment a;
    final /* synthetic */ acsu b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acsq(ffgu ffguVar, DittoAttachment dittoAttachment, acsu acsuVar) {
        super(2, ffguVar);
        this.a = dittoAttachment;
        this.b = acsuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((acsq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        try {
            eslt esltVar = (eslt) eslu.a.createBuilder();
            String b = this.a.b();
            esltVar.copyOnWrite();
            ((eslu) esltVar.instance).b = b;
            acsu acsuVar = this.b;
            InputStream b2 = eepn.b(acsuVar.c, this.a.a(), eepm.a);
            try {
                eyee B = eyee.B(b2);
                ffig.a(b2, null);
                esltVar.copyOnWrite();
                eslu esluVar = (eslu) esltVar.instance;
                B.getClass();
                esluVar.c = B;
                return (eslu) esltVar.build();
            } finally {
            }
        } catch (Exception e) {
            ensk j = acsu.a.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/dittosatellite/intent/DraftMessageJsBridgeRequestSender$convertToAttachment$lambda$9$lambda$8$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 146, "DraftMessageJsBridgeRequestSender.kt")).t("Unable to load bytes from uri: %s", cskt.b(this.a.a().toString()));
            return null;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        acsq acsqVar = new acsq(ffguVar, this.a, this.b);
        acsqVar.c = obj;
        return acsqVar;
    }
}
