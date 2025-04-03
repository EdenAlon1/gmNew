package defpackage;

import android.content.Intent;
import android.speech.SpeechRecognizer;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class siy extends ffhv implements ffjm {
    final /* synthetic */ siz a;
    final /* synthetic */ Locale b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public siy(ffgu ffguVar, siz sizVar, Locale locale) {
        super(2, ffguVar);
        this.a = sizVar;
        this.b = locale;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((siy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((SpeechRecognizer) ((Optional) this.a.c.b()).get()).triggerModelDownload(new Intent().putExtra("android.speech.extra.LANGUAGE", this.b.toLanguageTag()));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        siy siyVar = new siy(ffguVar, this.a, this.b);
        siyVar.c = obj;
        return siyVar;
    }
}
