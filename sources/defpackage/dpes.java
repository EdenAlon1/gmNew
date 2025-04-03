package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpes extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpev b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpes(dpev dpevVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpevVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpes) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        dpbk dpbdVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            if (this.b.h()) {
                throw new IllegalStateException("This instance has already been prepared");
            }
            ensk h = dpev.a.h();
            h.Y(ente.a, "HugoAudio");
            enrr enrrVar = (enrr) h.h("com/google/android/libraries/compose/audio/sink/FileAudioSink$prepare$2", "invokeSuspend", 68, "FileAudioSink.kt");
            dpew dpewVar = this.b.f;
            Uri uri = dpewVar.a;
            Objects.toString(uri);
            String concat = "outputUri = ".concat(uri.toString());
            eepm eepmVar = dpewVar.b;
            Objects.toString(eepmVar);
            String concat2 = "sourcePolicy = ".concat(eepmVar.toString());
            drjx drjxVar = dpewVar.d;
            Objects.toString(drjxVar);
            String concat3 = "format = ".concat(drjxVar.toString());
            String str = "sampleRate = " + dpewVar.e;
            String str2 = "bitRate = " + dpewVar.g;
            Integer num = dpewVar.h;
            Objects.toString(num);
            dpbk dpbkVar = null;
            enrrVar.t("Preparing FileAudioSink with configuration: %s", ffdo.R(new String[]{concat, concat2, concat3, str, "channelCount = 1", str2, "maxFileSize = ".concat(String.valueOf(num))}, null, 63));
            dpev dpevVar = this.b;
            drjx drjxVar2 = dpevVar.f.d;
            if (ffkj.e(drjxVar2, drjk.a)) {
                dpev dpevVar2 = this.b;
                dpew dpewVar2 = dpevVar2.f;
                dpbv dpbvVar = new dpbv(dpewVar2.a, dpewVar2.b, dpewVar2.e, dpewVar2.g, dpewVar2.h);
                dpbw dpbwVar = dpevVar2.c;
                ffhd ffhdVar = (ffhd) dpbwVar.a.b();
                ffhdVar.getClass();
                Context context = (Context) dpbwVar.b.b();
                context.getClass();
                dpbdVar = new dpbu(ffhdVar, context, dpbvVar);
            } else {
                if (!ffkj.e(drjxVar2, drji.a)) {
                    throw new IllegalArgumentException("Format " + this.b.f.d + " is not supported.");
                }
                dpev dpevVar3 = this.b;
                dpew dpewVar3 = dpevVar3.f;
                dpbe dpbeVar = new dpbe(dpewVar3.a, dpewVar3.b, dpewVar3.e, dpewVar3.g, dpewVar3.h);
                dpbf dpbfVar = dpevVar3.d;
                ffhd ffhdVar2 = (ffhd) dpbfVar.a.b();
                ffhdVar2.getClass();
                Context context2 = (Context) dpbfVar.b.b();
                context2.getClass();
                dpbdVar = new dpbd(ffhdVar2, context2, dpbeVar);
            }
            dpevVar.i = dpbdVar;
            dpbk dpbkVar2 = this.b.i;
            if (dpbkVar2 == null) {
                ffkj.c("encoder");
            } else {
                dpbkVar = dpbkVar2;
            }
            this.a = 1;
            if (dpbkVar.d(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpes(this.b, ffguVar);
    }
}
