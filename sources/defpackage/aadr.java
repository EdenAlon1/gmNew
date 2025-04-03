package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadr extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ axrc[] c;
    final /* synthetic */ alxr d;
    final /* synthetic */ dnbw e;
    final /* synthetic */ aaee f;
    final /* synthetic */ aacn g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aadr(ffgu ffguVar, axrc[] axrcVarArr, alxr alxrVar, dnbw dnbwVar, aaee aaeeVar, aacn aacnVar) {
        super(3, ffguVar);
        this.c = axrcVarArr;
        this.d = alxrVar;
        this.e = dnbwVar;
        this.f = aaeeVar;
        this.g = aacnVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        aadr aadrVar = new aadr((ffgu) obj3, this.c, this.d, this.e, this.f, this.g);
        aadrVar.h = (ffxy) obj;
        aadrVar.b = (Object[]) obj2;
        return aadrVar.b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ffxy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        domw domwVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r2 = this.h;
            Object obj2 = this.b;
            axrc[] axrcVarArr = this.c;
            ArrayList arrayList = new ArrayList(3);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                domwVar = null;
                if (i2 >= 3) {
                    break;
                }
                if (axrcVarArr[i2] != null) {
                    domwVar = ((Object[]) obj2)[i3];
                    i3++;
                }
                arrayList.add(domwVar);
                i2++;
            }
            Object[] array = arrayList.toArray(new Object[0]);
            Object obj3 = array[0];
            Object obj4 = array[1];
            boolean booleanValue = ((Boolean) array[2]).booleanValue();
            domw domwVar2 = (domw) obj4;
            dnuo dnuoVar = (dnuo) obj3;
            ensk e = aaee.a.e();
            e.Y(ente.a, "BugleImage");
            ((enrr) e.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$getDisplayableUiData$$inlined$combineInitialValuedFlow$2$3", "invokeSuspend", 423, "ImageBubbleUiAdapter.kt")).D("Image bubble with messageId = %s is in %s state", this.d.b().a(), this.e.f);
            aaee aaeeVar = this.f;
            if (booleanValue) {
                aagl aaglVar = (aagl) aaeeVar.g.b();
                aafr aafrVar = new aafr(this.d);
                aaee aaeeVar2 = this.f;
                dnuoVar = aaglVar.c(aafrVar, aaeeVar2.b.getString(R.string.message_bubble_save_to_device), new aadt(aaeeVar2, this.d));
            }
            dnuo dnuoVar2 = dnuoVar;
            if (!this.f.p.a()) {
                doml domlVar = (doml) domwVar2;
                if (domlVar != null) {
                    domwVar = doml.l(domlVar, null, null, null, null, null, true, true, 3080191);
                }
            } else if (domwVar2 != null) {
                if (domwVar2 instanceof doml) {
                    domwVar = doml.l((doml) domwVar2, null, null, null, null, null, true, true, 3080191);
                } else {
                    if (!(domwVar2 instanceof dmxv)) {
                        throw new IllegalStateException("Caption flow emits a value with unsupported type");
                    }
                    domwVar = dmxv.l((dmxv) domwVar2, null, true, true, 385023);
                }
            }
            dnbm a = aaeeVar.a(dnbw.r(this.e, dnuoVar2, null, null, null, booleanValue, domwVar, null, null, 245487), this.g);
            this.a = 1;
            if (r2.fQ(a, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
