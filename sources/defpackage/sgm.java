package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.io.FileNotFoundException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ sgn b;
    final /* synthetic */ ceuw c;
    final /* synthetic */ sgr d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgm(ffgu ffguVar, sgn sgnVar, ceuw ceuwVar, sgr sgrVar) {
        super(2, ffguVar);
        this.b = sgnVar;
        this.c = ceuwVar;
        this.d = sgrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sgm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object k;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        try {
        } catch (FileNotFoundException e) {
            sgn sgnVar = this.b;
            final sgr sgrVar = this.d;
            this.a = 2;
            ((ensz) ((ensz) sgo.a.j()).g(e)).q("Attempting retry.");
            final Uri parse = Uri.parse(sgrVar.d);
            bwdf c = PartsTable.c();
            c.z("FileAudioLevelsHandler#attemptRetryFileNotFound");
            c.h(new Function() { // from class: sgf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    bwdm bwdmVar = (bwdm) obj2;
                    bwdmVar.n(bdhb.b(sgr.this.c));
                    bwdmVar.x();
                    Uri uri = parse;
                    bwdmVar.z(uri);
                    bwdmVar.q(uri);
                    return bwdmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            engw y = c.b().y();
            y.getClass();
            PartsTable.BindData bindData = (PartsTable.BindData) ffdx.M(y);
            if (bindData == null) {
                ((ensz) sgo.a.j()).q("Retry failed. No new content uri found.");
                k = ceyt.k();
            } else {
                ((ensz) sgo.a.h()).t("Retrying, found new uri: %s", String.valueOf(bindData.t()));
                Uri t = bindData.t();
                t.getClass();
                k = sgnVar.a(t, sgrVar, this);
            }
            if (k == ffhhVar) {
            }
        } catch (Exception e2) {
            ((ensz) ((ensz) sgo.a.j()).g(e2)).q("Work request failed.");
            k = ceyt.k();
        }
        if (i == 0) {
            ffci.b(obj);
            if (!((Boolean) this.b.b.b()).booleanValue()) {
                ((ensz) sgo.a.h()).q("Work request failed. Waveform flag not enabled.");
                return ceyt.k();
            }
            ((ensz) sgo.a.h()).r("Attempt count: %d", ((cetk) this.c.a()).c);
            sgn sgnVar2 = this.b;
            Uri parse2 = Uri.parse(this.d.d);
            parse2.getClass();
            sgr sgrVar2 = this.d;
            this.a = 1;
            obj = sgnVar2.a(parse2, sgrVar2, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        } else {
            if (i != 1) {
                ffci.b(obj);
                return obj;
            }
            ffci.b(obj);
        }
        k = (ceyt) obj;
        k.getClass();
        return k;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        sgm sgmVar = new sgm(ffguVar, this.b, this.c, this.d);
        sgmVar.e = obj;
        return sgmVar;
    }
}
