package defpackage;

import android.content.Intent;
import com.google.chat.smartmessaging.penpal.ui.EmotifyActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emeq {
    public final ffbr a;
    public final ffbr b;
    public final adak c;

    public emeq(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = ffbrVar;
        this.b = ffbrVar3;
        Object b = ffbrVar2.b();
        b.getClass();
        this.c = (adak) fflm.b((Optional) b);
    }

    public final void a(int i, Intent intent) {
        ((EmotifyActivity) this.a.b()).setResult(i, intent);
        ((EmotifyActivity) this.a.b()).finish();
    }
}
