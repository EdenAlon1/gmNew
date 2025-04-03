package defpackage;

import com.google.android.libraries.compose.tenor.rest.MediaResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dsew extends ffkh implements ffji {
    public dsew(Object obj) {
        super(1, obj, dseq.class, "gifFromMediaResult", "gifFromMediaResult(Lcom/google/android/libraries/compose/tenor/rest/MediaResult;)Lcom/google/android/libraries/compose/gif/data/GifMedia;", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MediaResult mediaResult = (MediaResult) obj;
        mediaResult.getClass();
        return new drcr(mediaResult.getId(), mediaResult.title(), mediaResult.getUrl(), dseq.c(mediaResult.getMedia(), false), null, 16);
    }
}
