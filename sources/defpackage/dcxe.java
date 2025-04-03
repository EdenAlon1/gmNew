package defpackage;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcxe implements miu {
    public final dcxa a;
    public final alim b;
    public final alhx c;
    public final alip d;
    public final ffbr e;
    public ExoPlayer f;
    public dcwy g;
    public dbti h;
    public long i;
    public long j;
    public boolean k = false;

    public dcxe(dcxa dcxaVar, alim alimVar, alhx alhxVar, alip alipVar, ffbr ffbrVar) {
        this.a = dcxaVar;
        this.b = alimVar;
        this.c = alhxVar;
        this.d = alipVar;
        this.e = ffbrVar;
    }

    public static dcxa k(Uri uri, int i, int i2, int i3, long j, boolean z) {
        dcxa dcxaVar = new dcxa();
        fbae.e(dcxaVar);
        Bundle bundle = new Bundle();
        bundle.putParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        bundle.putInt("opening_source", i);
        bundle.putInt("total_pages", i2);
        bundle.putInt("relative_index_to_start_page", i3);
        bundle.putLong("video_start_ts", j);
        bundle.putBoolean("start_playing_video", z);
        dcxaVar.at(bundle);
        return dcxaVar;
    }

    @Override // defpackage.miu
    public final void c(mis misVar, boolean z) {
        if (z) {
            this.j = misVar.a;
        } else {
            this.i += misVar.a - this.j;
        }
    }

    @Override // defpackage.miu
    public final void f(int i) {
        if (i == 1) {
            alim alimVar = this.b;
            final eqad m = m();
            final epzq l = l();
            final long j = j();
            alimVar.o(new Supplier() { // from class: alij
                @Override // java.util.function.Supplier
                public final Object get() {
                    return alim.b(eqad.this, l, 4, j);
                }
            });
        }
    }

    public final long j() {
        return TimeUnit.MILLISECONDS.toSeconds(this.f.A());
    }

    public final epzq l() {
        int i = this.a.m.getInt("relative_index_to_start_page");
        epqs epqsVar = (epqs) eprl.a.createBuilder();
        epqsVar.copyOnWrite();
        eprl eprlVar = (eprl) epqsVar.instance;
        eprlVar.b |= 8;
        eprlVar.g = "video/";
        return alhu.a(i, 1, (eprl) epqsVar.build(), false);
    }

    public final eqad m() {
        return alie.a(eqac.a(this.a.m.getInt("opening_source")), this.a.m.getInt("total_pages"));
    }

    @Override // defpackage.miu
    public final /* synthetic */ void e(lrh lrhVar) {
    }

    @Override // defpackage.miu
    public final /* synthetic */ void g(meb mebVar) {
    }

    @Override // defpackage.miu
    public final /* synthetic */ void h(lsl lslVar) {
    }

    @Override // defpackage.miu
    public final /* synthetic */ void i(boolean z) {
    }

    @Override // defpackage.miu
    public final /* synthetic */ void a(mis misVar, mth mthVar) {
    }

    @Override // defpackage.miu
    public final /* synthetic */ void b(lro lroVar, mit mitVar) {
    }

    @Override // defpackage.miu
    public final /* synthetic */ void d(mis misVar, int i, long j) {
    }
}
