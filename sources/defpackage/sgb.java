package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgb extends ffhv implements ffjm {
    final /* synthetic */ MessagePartCoreData a;
    final /* synthetic */ sgd b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgb(ffgu ffguVar, MessagePartCoreData messagePartCoreData, sgd sgdVar) {
        super(2, ffguVar);
        this.a = messagePartCoreData;
        this.b = sgdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sgb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((enrr) sgd.a.h().h("com/google/android/apps/messaging/audio/amplitude/AmplitudeTriggerListener$queueForAmplitude$1$invokeSuspend$lambda$3$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 97, "AmplitudeTriggerListener.kt")).t("Queuing contentUri: %s", String.valueOf(this.a.t()));
        sgp sgpVar = this.b.c;
        sgq sgqVar = (sgq) sgr.a.createBuilder();
        sgqVar.getClass();
        String a = this.a.A().a();
        a.getClass();
        sgqVar.copyOnWrite();
        ((sgr) sgqVar.instance).b = a;
        String b = this.a.B().b();
        b.getClass();
        sgqVar.copyOnWrite();
        ((sgr) sgqVar.instance).c = b;
        Uri t = this.a.t();
        t.getClass();
        String uri = t.toString();
        uri.getClass();
        sgqVar.copyOnWrite();
        ((sgr) sgqVar.instance).d = uri;
        eyfy build = sgqVar.build();
        build.getClass();
        ((cevh) sgpVar.a.b()).a(ceyr.g("file_audio_levels", (sgr) build));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        sgb sgbVar = new sgb(ffguVar, this.a, this.b);
        sgbVar.c = obj;
        return sgbVar;
    }
}
