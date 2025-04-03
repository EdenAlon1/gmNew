package defpackage;

import android.content.ComponentName;
import android.content.ContentUris;
import android.content.Intent;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.speech.SpeechRecognizer;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sld extends ffhv implements ffjm {
    final /* synthetic */ slf a;
    final /* synthetic */ ffwm b;
    final /* synthetic */ ParcelFileDescriptor c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ String f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sld(ffgu ffguVar, slf slfVar, ffwm ffwmVar, ParcelFileDescriptor parcelFileDescriptor, int i, int i2, String str) {
        super(2, ffguVar);
        this.a = slfVar;
        this.b = ffwmVar;
        this.c = parcelFileDescriptor;
        this.d = i;
        this.e = i2;
        this.f = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sld) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = ((Optional) this.a.e.b()).get();
        SpeechRecognizer speechRecognizer = (SpeechRecognizer) obj2;
        speechRecognizer.setRecognitionListener(new sky(this.a.a, this.b));
        ParcelFileDescriptor parcelFileDescriptor = this.c;
        int i = this.d;
        int i2 = this.e;
        slf slfVar = this.a;
        Intent a = slg.a(slfVar.a);
        if (kqq.b()) {
            a.putExtra("android.speech.extra.AUDIO_SOURCE", parcelFileDescriptor);
            a.putExtra("android.speech.extra.AUDIO_SOURCE_SAMPLING_RATE", i);
            a.putExtra("android.speech.extra.AUDIO_SOURCE_CHANNEL_COUNT", i2);
        } else {
            Uri b = cbgl.b(slfVar.a, ContentUris.appendId(new Uri.Builder().scheme("content").authority("com.google.android.apps.messaging.shared.datamodel.provider.AudioProxyProviderUtil"), parcelFileDescriptor.getFd()).build(), "audio/raw", "audio/raw", 0L);
            slfVar.a.grantUriPermission(((ComponentName) ((Optional) slfVar.d.b()).get()).getPackageName(), b, 1);
            b.getClass();
            a.putExtra("com.google.recognition.extra.AUDIO_SOURCE", b);
            a.putExtra("com.google.recognition.extra.AUDIO_SOURCE_SAMPLING_RATE", i);
            a.putExtra("com.google.recognition.extra.AUDIO_SOURCE_CHANNEL_COUNT", i2);
        }
        a.putExtra("android.speech.extra.LANGUAGE", this.f);
        speechRecognizer.startListening(a);
        return obj2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        sld sldVar = new sld(ffguVar, this.a, this.b, this.c, this.d, this.e, this.f);
        sldVar.g = obj;
        return sldVar;
    }
}
