package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class siu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ siz b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public siu(ffgu ffguVar, siz sizVar) {
        super(2, ffguVar);
        this.b = sizVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((siu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
            return obj;
        }
        ffci.b(obj);
        Intent intent = new Intent("android.speech.action.GET_LANGUAGE_DETAILS");
        siz sizVar = this.b;
        enru enruVar = eerd.a;
        Iterator<ResolveInfo> it = sizVar.d.getPackageManager().queryBroadcastReceivers(new Intent("android.speech.action.GET_LANGUAGE_DETAILS"), 0).iterator();
        ComponentName componentName = null;
        ComponentName componentName2 = null;
        while (true) {
            if (it.hasNext()) {
                ResolveInfo next = it.next();
                if (next.activityInfo.packageName.equals("com.google.android.tts") && Build.VERSION.SDK_INT >= 31) {
                    componentName = new ComponentName(next.activityInfo.packageName, next.activityInfo.name);
                    break;
                }
                if (next.activityInfo.packageName.equals("com.google.android.googlequicksearchbox") && next.activityInfo.name.equals("com.google.android.apps.gsa.languagepack.LanguagePackDetailsReceiver_Receiver")) {
                    componentName2 = new ComponentName(next.activityInfo.packageName, next.activityInfo.name);
                }
            } else if (componentName2 == null) {
                ((enrr) ((enrr) eerd.a.j()).h("com/google/android/libraries/speech/transcription/TranscriptionUtils", "getModelManagerLPDetailsComponent", 211, "TranscriptionUtils.java")).q("No Model Manager Get Language Pack Details API provided by Google.");
            } else {
                componentName = componentName2;
            }
        }
        Intent putExtra = intent.setComponent(componentName).putExtra("com.google.recognition.extra.RETURN_OFFLINE_LANGUAGE_DETAILS", true).putExtra("calling_package", this.b.d.getPackageName());
        putExtra.getClass();
        this.c = this;
        this.a = 1;
        ffrh ffrhVar = new ffrh(ffhi.c(this), 1);
        ffrhVar.B();
        siz sizVar2 = this.b;
        ffsk ffskVar = (ffsk) sizVar2.i.a.b();
        ffskVar.getClass();
        sizVar2.d.sendOrderedBroadcast(putExtra, null, new sip(ffskVar, ffrhVar), null, -1, null, null);
        Object m = ffrhVar.m();
        return m == ffhhVar ? ffhhVar : m;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        siu siuVar = new siu(ffguVar, this.b);
        siuVar.c = obj;
        return siuVar;
    }
}
