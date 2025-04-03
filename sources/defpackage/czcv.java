package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czcv implements czbt {
    public final Context a;
    public final ConversationId b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final boolean f;
    private final ffsk g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffxx l;
    private final ffbr m;
    private final elfl n;
    private final elfl o;
    private final elfl p;
    private final ffxx q;
    private final elfl r;
    private final elfl s;
    private final fgdj t;
    private final ffxx u;
    private final ffxx v;
    private final fgcm w;
    private final fgdj x;

    public czcv(Context context, ffsk ffskVar, ffbr ffbrVar, ConversationId conversationId, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffxx ffxxVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8) {
        context.getClass();
        ffskVar.getClass();
        conversationId.getClass();
        ffxxVar.getClass();
        ffbrVar8.getClass();
        this.a = context;
        this.g = ffskVar;
        this.h = ffbrVar;
        this.b = conversationId;
        this.i = ffbrVar2;
        this.j = ffbrVar3;
        this.k = ffbrVar4;
        this.l = ffxxVar;
        this.c = ffbrVar5;
        this.d = ffbrVar6;
        this.e = ffbrVar7;
        this.m = ffbrVar8;
        this.f = conversationId instanceof PenpalBotConversationId;
        elfl s = ((alye) ffbrVar.b()).s(engw.r(appn.d));
        s.getClass();
        axol.n(s);
        this.n = s;
        elfl s2 = ((alye) ffbrVar.b()).s(engw.r(appn.b));
        s2.getClass();
        axol.n(s2);
        this.o = s2;
        elfl s3 = ((alye) ffbrVar.b()).s(engw.r(appn.c));
        s3.getClass();
        axol.n(s3);
        this.p = s3;
        this.q = axsp.h(axrb.a(axol.f(s), "Videos"), axrb.a(axol.f(s2), "Links"), axrb.a(axol.f(s3), "Locations"), ffskVar, new czcu(null));
        elfl s4 = ((alye) ffbrVar.b()).s(engw.r(appn.a));
        s4.getClass();
        axol.n(s4);
        this.r = s4;
        elfl p = ((alye) ffbrVar.b()).p();
        p.getClass();
        axol.n(p);
        this.s = p;
        czcq czcqVar = new czcq(ffxxVar, this);
        int i = fgcz.a;
        this.t = fgbn.b(czcqVar, ffskVar, fgcy.b, null);
        ffxxVar = ((aspy) ffbrVar8.b()).a() ? fgdm.a(Boolean.valueOf(conversationId instanceof PenpalBotConversationId)) : ffxxVar;
        this.u = ffxxVar;
        czct czctVar = new czct(ffxxVar);
        this.v = czctVar;
        fgcm a = fgdm.a(new czdb(null, 3));
        this.w = a;
        this.x = fgbn.b(axsp.j(axrb.a(czctVar, "GeminiProactiveStateCacheInit"), axrb.b(a, "GeminiProactiveStateCacheSet"), ffskVar, new czcn(null)), ffskVar, fgcy.b, new czdb(null, 3));
    }

    @Override // defpackage.czbt
    public final fgdj a() {
        ffxx d = axsp.d(axrb.a(this.q, "VideosLinksPlacesCount"), axrb.a(axol.f(this.r), "ImagePreview"), axrb.a(axol.f(this.s), "StarredCount"), axrb.a(((wwm) this.i.b()).b, "ImageSearchActionPlugin"), axrb.a(((wyu) this.j.b()).c, "SearchActionPlugin"), axrb.a(((xcq) this.k.b()).c, "ViewStarredActionPlugin"), axrb.a(this.l, "IsPenpalConversation"), axrb.c(this.t, "GeminiLocation"), axrb.c(this.x, "GeminiProactiveStateResult"), this.g, new czce(this, null));
        int i = fgcz.a;
        return fgbn.b(d, this.g, fgcy.a(0L, 3), null);
    }

    @Override // defpackage.czbt
    public final fgdj b() {
        ffxx g = axsp.g(axrb.a(this.q, "VideosLinksPlacesCount"), axrb.a(axol.f(this.r), "ImagePreview"), axrb.a(axol.f(this.s), "StarredCount"), axrb.a(((wwm) this.i.b()).b, "ImageSearchActionPlugin"), axrb.a(((wyu) this.j.b()).c, "SearchActionPlugin"), axrb.a(((xcq) this.k.b()).c, "ViewStarredActionPlugin"), axrb.c(this.x, "GeminiGetProactiveStateResult"), this.g, new czcm(this, null));
        int i = fgcz.a;
        return fgbn.b(g, this.g, fgcy.a(0L, 3), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.czbs c(defpackage.fbpo r19) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czcv.c(fbpo):czbs");
    }

    public final czbs d() {
        String string = this.a.getString(R.string.penpal_activity_item_title);
        string.getClass();
        return new czbs(new dnlz(string, null, null, null, null, new dnlf(dmzz.bH), new dnlf(dmzz.ah), new ffix() { // from class: czbv
            @Override // defpackage.ffix
            public final Object invoke() {
                aigz aigzVar = (aigz) czcv.this.d.b();
                Uri parse = Uri.parse("https://myactivity.google.com/product/gemini");
                parse.getClass();
                aigzVar.h(new aile(parse));
                return ffcu.a;
            }
        }, 30));
    }

    public final czbs e() {
        String string = this.a.getString(R.string.penpal_extension_item_title);
        string.getClass();
        return new czbs(new dnlz(string, null, null, null, null, new dnlf(dmzz.bb), new dnlf(dmzz.ah), new ffix() { // from class: czbu
            @Override // defpackage.ffix
            public final Object invoke() {
                czcv czcvVar = czcv.this;
                String language = ctid.c(czcvVar.a).getLanguage();
                aigz aigzVar = (aigz) czcvVar.d.b();
                Uri parse = Uri.parse("https://bard.google.com/extensions?hl=".concat(String.valueOf(language)));
                parse.getClass();
                aigzVar.h(new aile(parse));
                return ffcu.a;
            }
        }, 30));
    }
}
