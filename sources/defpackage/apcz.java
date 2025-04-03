package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apcz implements apuh {
    private final apdc a;
    private final Set b;

    public apcz(apdc apdcVar) {
        apdcVar.getClass();
        this.a = apdcVar;
        this.b = fffi.d(appv.TABLE_HEAD, appv.TABLE_BODY, appv.TABLE_ROW, appv.TABLE_CELL);
    }

    @Override // defpackage.apuh
    public final buxo a(buxo buxoVar) {
        btta b = bttf.b();
        b.z("LoadMessageAnnotationExtension#extendQuery");
        b.c(new Function() { // from class: apcw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btsl btslVar = (btsl) obj;
                fffs fffsVar = new fffs((byte[]) null);
                fffsVar.add(btslVar.d);
                fffsVar.add(btslVar.e);
                btsm[] btsmVarArr = (btsm[]) ffdx.a(fffsVar).toArray(new btsm[0]);
                return (btsm[]) Arrays.copyOf(btsmVarArr, btsmVarArr.length);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        b.f(new Function() { // from class: apcx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btte btteVar = (btte) obj;
                if (((Boolean) ((cfup) ctjd.aE.get()).e()).booleanValue()) {
                    return btteVar;
                }
                btteVar.aq(new dtrw("messages_annotations.annotation_type", 4, btte.au(new int[0]), true));
                return btteVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btsz b2 = b.b();
        btsm btsmVar = bttf.c.c;
        buun buunVar = MessagesTable.c.a;
        btte btteVar = new btte();
        btteVar.c();
        buxoVar.G(b2.s(btsmVar, buunVar, new bttd(btteVar)).g());
        return buxoVar;
    }

    @Override // defpackage.apuh
    public final boolean c() {
        return true;
    }

    @Override // defpackage.apuh
    public final void d(apuf apufVar, MessagesTable.BindData bindData, aoug aougVar, enhk enhkVar, amfx amfxVar, aptd aptdVar) {
        bindData.getClass();
        aougVar.getClass();
        enhkVar.getClass();
        amfxVar.getClass();
        String[] strArr = bttf.a;
        btrw[] btrwVarArr = (btrw[]) bindData.aG("messages_annotations", new btrw[0]);
        int i = engw.d;
        engr engrVar = new engr();
        Iterator a = ffjw.a(btrwVarArr);
        int i2 = 1;
        while (a.hasNext()) {
            btrw btrwVar = (btrw) a.next();
            if (btrwVar.k() == 1) {
                i2 = 2;
            }
            fbuk n = btrwVar.n();
            if (n != null) {
                apcy apcyVar = new apcy(n);
                if (!this.b.contains(apcyVar.c())) {
                    engrVar.h(apcyVar);
                } else if (((Boolean) ((cfup) ctjd.aE.get()).e()).booleanValue()) {
                    engrVar.h(apcyVar);
                }
            }
        }
        ((apsm) apufVar).i = i2;
        apufVar.b(engrVar.g());
    }

    @Override // defpackage.apuh
    public final aptb e() {
        return this.a;
    }

    @Override // defpackage.apuh
    public final /* synthetic */ bwdf b(bwdf bwdfVar) {
        return bwdfVar;
    }
}
