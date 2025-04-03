package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Size;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItem;
import com.google.android.libraries.stickers.gallery.StickerGalleryActivity;
import j$.util.function.BiConsumer$CC;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcco extends dcar implements dcab {
    private final dccj c;
    private final dccm d;
    private final dbxy e;
    private final alct f;
    private final cqoh g;
    private final dcbc m;
    private dccl n;
    private dccd o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dcco(defpackage.cuxz r4, defpackage.dccm r5, defpackage.dccj r6, defpackage.cqoh r7, defpackage.alct r8, defpackage.dcbc r9) {
        /*
            r3 = this;
            eymn r0 = defpackage.eymn.EXPRESSIVE_STICKER
            r1 = r9
            dcav r1 = (defpackage.dcav) r1
            int r2 = r1.h
            r3.<init>(r4, r0, r2)
            r3.c = r6
            r3.d = r5
            dbxy r4 = r1.d
            r3.e = r4
            r3.f = r8
            r3.g = r7
            r3.m = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcco.<init>(cuxz, dccm, dccj, cqoh, alct, dcbc):void");
    }

    private final dccl G() {
        dcco dccoVar;
        if (this.n == null) {
            dccm dccmVar = this.d;
            dccj dccjVar = this.c;
            dcbc dcbcVar = this.m;
            BiConsumer biConsumer = new BiConsumer() { // from class: dccn
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    int intValue = ((Integer) obj2).intValue();
                    dcco.this.F((eptm) obj, intValue);
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer2);
                }
            };
            Context context = (Context) dccmVar.a.b();
            context.getClass();
            altk altkVar = (altk) dccmVar.b.b();
            altkVar.getClass();
            cxqk cxqkVar = (cxqk) dccmVar.c.b();
            cxqkVar.getClass();
            dcav dcavVar = (dcav) dcbcVar;
            dccoVar = this;
            dccoVar.n = new dccl(context, altkVar, cxqkVar, dccjVar, dcavVar.b, dccoVar, dcavVar.i, dcavVar.h, biConsumer);
        } else {
            dccoVar = this;
        }
        return dccoVar.n;
    }

    private final void H() {
        cqoh cqohVar = this.g;
        epts eptsVar = epts.STICKER;
        eptu eptuVar = eptu.EXPANDED;
        cqohVar.f().toEpochMilli();
        this.f.b(eptsVar, eptuVar, eptk.UNKNOWN_CLOSING_SOURCE);
    }

    @Override // defpackage.dcar
    protected final dbzy A() {
        return G();
    }

    public final void F(eptm eptmVar, int i) {
        this.g.f().toEpochMilli();
        dbxp dbxpVar = (dbxp) this.e;
        Intent intent = new Intent(dbxpVar.w.G(), (Class<?>) StickerGalleryActivity.class);
        intent.putExtra("starting_page", i);
        intent.putExtra("show_back_button", true);
        crjx crjxVar = dbxpVar.y;
        intent.putExtra("theme_mode", (crjxVar == null || !crjxVar.g()) ? 0 : 1);
        dbxpVar.i(intent, 133, eptmVar);
        dbxpVar.q(epts.STICKER, eptmVar);
    }

    @Override // defpackage.dcae
    public final int a() {
        return R.dimen.sticker_content_item_size;
    }

    @Override // defpackage.dcae
    public final int b() {
        return R.string.c2o_category_expressive_stickers_toggle_content_description;
    }

    @Override // defpackage.dcae
    protected final int c() {
        return R.drawable.ic_insert_sticker_white;
    }

    @Override // defpackage.dcae
    public final Set d() {
        HashSet hashSet = new HashSet();
        hashSet.add(133);
        return hashSet;
    }

    @Override // defpackage.dcab
    public final void e(eptm eptmVar) {
        F(eptmVar, ((Integer) cful.Q.e()).intValue());
    }

    @Override // defpackage.dcae
    public final void f(cxqz cxqzVar) {
        eumg eumgVar;
        if (cxqzVar.b == -1) {
            try {
                byte[] byteArrayExtra = cxqzVar.c.getByteArrayExtra("sticker");
                byteArrayExtra.getClass();
                ewnk ewnkVar = (ewnk) eyfy.parseFrom(ewnk.a, byteArrayExtra, eyfc.a());
                switch (cxqzVar.c.getIntExtra("interaction_source", 0)) {
                    case 0:
                        eumgVar = eumg.UNKNOWN;
                        break;
                    case 1:
                        eumgVar = eumg.BROWSE;
                        break;
                    case 2:
                        eumgVar = eumg.FAVORTIES;
                        break;
                    case 3:
                        eumgVar = eumg.STICKER_SEARCH_RESULTS;
                        break;
                    case 4:
                        eumgVar = eumg.CLIENT_PICKER_RECENTS;
                        break;
                    case 5:
                        eumgVar = eumg.CLIENT_PICKER_FAVORITES;
                        break;
                    case 6:
                        eumgVar = eumg.QUERY_SUGGESTION;
                        break;
                    case 7:
                        eumgVar = eumg.SEARCH_ICON;
                        break;
                    case 8:
                        eumgVar = eumg.GALLERY_BUTTON;
                        break;
                    case 9:
                        eumgVar = eumg.PACK_DETAIL;
                        break;
                    case 10:
                        eumgVar = eumg.FAVORITES;
                        break;
                    case 11:
                        eumgVar = eumg.IMPLICIT_SEARCH_TEXT;
                        break;
                    case 12:
                        eumgVar = eumg.EXPLICIT_SEARCH_TEXT;
                        break;
                    case 13:
                        eumgVar = eumg.MEGAMODE;
                        break;
                    case 14:
                        eumgVar = eumg.CLIENT_AVATAR_PROMO_BANNER;
                        break;
                    case 15:
                        eumgVar = eumg.CLIENT_AVATAR_MEGAMODE_BANNER;
                        break;
                    case 16:
                        eumgVar = eumg.CLIENT_AVATAR_FEATURE_CARD;
                        break;
                    case 17:
                        eumgVar = eumg.SHARE_SHEET;
                        break;
                    case 18:
                        eumgVar = eumg.CLIENT_BROWSE;
                        break;
                    case 19:
                        eumgVar = eumg.CLIENT_PACK_DETAIL;
                        break;
                    case 20:
                        eumgVar = eumg.CLIENT_FEATURED;
                        break;
                    default:
                        eumgVar = null;
                        break;
                }
                dccl G = G();
                if (((Boolean) cful.o.e()).booleanValue()) {
                    uel uelVar = new uel();
                    ewmw ewmwVar = ewnkVar.e;
                    if (ewmwVar == null) {
                        ewmwVar = ewmw.a;
                    }
                    uelVar.c(caqv.a(ewmwVar));
                    ewmw ewmwVar2 = ewnkVar.e;
                    if (ewmwVar2 == null) {
                        ewmwVar2 = ewmw.a;
                    }
                    uelVar.e(Uri.parse(ewmwVar2.c));
                    ewmw ewmwVar3 = ewnkVar.e;
                    if (ewmwVar3 == null) {
                        ewmwVar3 = ewmw.a;
                    }
                    ewmt ewmtVar = ewmwVar3.f;
                    if (ewmtVar == null) {
                        ewmtVar = ewmt.a;
                    }
                    int i = ewmtVar.b;
                    ewmw ewmwVar4 = ewnkVar.e;
                    if (ewmwVar4 == null) {
                        ewmwVar4 = ewmw.a;
                    }
                    ewmt ewmtVar2 = ewmwVar4.f;
                    if (ewmtVar2 == null) {
                        ewmtVar2 = ewmt.a;
                    }
                    uelVar.a = new Size(i, ewmtVar2.c);
                    uelVar.d(ewnkVar.c);
                    uelVar.b(dccl.h(eumgVar));
                    ufg a = uelVar.a();
                    G.A.l(a);
                    G.a.a(a, dcle.b(epts.STICKER, eptu.EXPANDED), false);
                } else {
                    ExpressiveStickerContentItem expressiveStickerContentItem = new ExpressiveStickerContentItem(ewnkVar, dccl.h(eumgVar));
                    G.A.r(expressiveStickerContentItem);
                    G.a.b(expressiveStickerContentItem, dcle.b(epts.STICKER, eptu.EXPANDED), false);
                }
                G.f.w(ewnkVar.c, eumgVar);
                H();
                return;
            } catch (eygu e) {
                csjy.p("Bugle", e, "Error parsing expressive sticker intent result.");
            }
        }
        H();
    }

    @Override // defpackage.dcae
    public final void h() {
        dccj dccjVar = this.c;
        elfl elflVar = dccjVar.g;
        if (elflVar != null) {
            elflVar.cancel(true);
            dccjVar.g = null;
        }
        elfl elflVar2 = dccjVar.h;
        if (elflVar2 != null) {
            elflVar2.cancel(true);
            dccjVar.h = null;
        }
        dcci dcciVar = dccjVar.f;
        if (dcciVar != null) {
            dccjVar.b.unregisterContentObserver(dcciVar);
            dccjVar.f.a = false;
            dccjVar.f = null;
        }
    }

    @Override // defpackage.dcat
    public final void j() {
        F(eptm.CATEGORY_HEADER, ((Integer) cful.P.e()).intValue());
    }

    @Override // defpackage.dcar
    protected final int k() {
        return R.string.c2o_category_name_stickers;
    }

    @Override // defpackage.dcae
    public final boolean m() {
        return true;
    }

    @Override // defpackage.dcae
    public final void s() {
        this.c.c();
    }

    @Override // defpackage.dcae
    public final void v(dbzn dbznVar) {
        this.i = dbznVar;
        G().a = dbznVar;
    }

    @Override // defpackage.dcar
    protected final dbzx z() {
        dccd dccdVar = this.o;
        if (dccdVar != null) {
            return dccdVar;
        }
        dccd dccdVar2 = new dccd(G());
        this.o = dccdVar2;
        dccdVar2.B(true);
        dccj dccjVar = this.c;
        dccd dccdVar3 = this.o;
        dccjVar.i = dccdVar3;
        return dccdVar3;
    }
}
