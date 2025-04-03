package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifContentItem;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emcr implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ emcs b;

    public emcr(emcs emcsVar, String str) {
        this.a = str;
        this.b = emcsVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        fbee fbeeVar = (fbee) obj;
        if (TextUtils.equals(this.a, this.b.e) && this.b.d != null) {
            emct emctVar = this.b.d;
            eygr<fbeg> eygrVar = fbeeVar.b;
            dcil dcilVar = (dcil) emctVar;
            if (TextUtils.isEmpty(dcilVar.t)) {
                return;
            }
            dcilVar.g(false);
            dcin dcinVar = dcilVar.i;
            dcinVar.d.clear();
            for (fbeg fbegVar : eygrVar) {
                List list = dcinVar.d;
                fbea fbeaVar = fbegVar.f;
                if (fbeaVar == null) {
                    fbeaVar = fbea.a;
                }
                Uri parse = Uri.parse(fbeaVar.c);
                fbea fbeaVar2 = fbegVar.g;
                if (fbeaVar2 == null) {
                    fbeaVar2 = fbea.a;
                }
                Uri parse2 = Uri.parse(fbeaVar2.c);
                Uri parse3 = Uri.parse(fbegVar.c);
                String str = fbegVar.d;
                String str2 = fbegVar.e;
                String str3 = fbegVar.i;
                fbei fbeiVar = fbeaVar.d;
                if (fbeiVar == null) {
                    fbeiVar = fbei.a;
                }
                int i = fbeiVar.b;
                fbei fbeiVar2 = fbeaVar.d;
                if (fbeiVar2 == null) {
                    fbeiVar2 = fbei.a;
                }
                list.add(new GifContentItem(parse, parse2, parse3, str, str2, str3, i, fbeiVar2.c));
            }
            dcinVar.a = false;
            dcinVar.p();
            dcilVar.k.ak(0);
            dcilVar.a.af(epto.LOADED);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        if (this.b.d != null) {
            dcil dcilVar = (dcil) this.b.d;
            dcilVar.g(false);
            dcilVar.a.af(epto.FAILED_TO_LOAD);
        }
    }
}
