package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadp implements ffix {
    final /* synthetic */ axrc[] a;
    final /* synthetic */ alxr b;
    final /* synthetic */ dnbw c;
    final /* synthetic */ aaee d;
    final /* synthetic */ aacn e;

    public aadp(axrc[] axrcVarArr, alxr alxrVar, dnbw dnbwVar, aaee aaeeVar, aacn aacnVar) {
        this.a = axrcVarArr;
        this.b = alxrVar;
        this.c = dnbwVar;
        this.d = aaeeVar;
        this.e = aacnVar;
    }

    @Override // defpackage.ffix
    public final dnbm invoke() {
        domw domwVar;
        ArrayList arrayList = new ArrayList(3);
        int i = 0;
        while (true) {
            domwVar = null;
            Object obj = null;
            domwVar = null;
            if (i >= 3) {
                break;
            }
            axrc axrcVar = this.a[i];
            if (axrcVar != null) {
                obj = axrcVar.b();
            }
            arrayList.add(obj);
            i++;
        }
        Object[] array = arrayList.toArray(new Object[0]);
        Object obj2 = array[0];
        Object obj3 = array[1];
        boolean booleanValue = ((Boolean) array[2]).booleanValue();
        domw domwVar2 = (domw) obj3;
        dnuo dnuoVar = (dnuo) obj2;
        ensk e = aaee.a.e();
        e.Y(ente.a, "BugleImage");
        ((enrr) e.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$getDisplayableUiData$$inlined$combineInitialValuedFlow$1", "invoke", 423, "ImageBubbleUiAdapter.kt")).D("Image bubble with messageId = %s is in %s state", this.b.b().a(), this.c.f);
        aaee aaeeVar = this.d;
        if (booleanValue) {
            aagl aaglVar = (aagl) aaeeVar.g.b();
            aafr aafrVar = new aafr(this.b);
            aaee aaeeVar2 = this.d;
            dnuoVar = aaglVar.c(aafrVar, aaeeVar2.b.getString(R.string.message_bubble_save_to_device), new aadt(aaeeVar2, this.b));
        }
        dnuo dnuoVar2 = dnuoVar;
        if (!this.d.p.a()) {
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
        return aaeeVar.a(dnbw.r(this.c, dnuoVar2, null, null, null, booleanValue, domwVar, null, null, 245487), this.e);
    }
}
