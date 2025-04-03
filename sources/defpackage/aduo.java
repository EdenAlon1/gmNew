package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.gms.feedback.FileTeleporter;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aduo implements adtw {
    private final Context a;
    private final errl b;

    public aduo(Context context, errl errlVar) {
        this.a = context;
        this.b = errlVar;
    }

    @Override // defpackage.adtw
    public final elfl a() {
        return elfo.e(new HashMap());
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl b() {
        return cfzj.b();
    }

    @Override // defpackage.cfzm
    public final elfl c() {
        return elfo.g(new Callable() { // from class: adun
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object apply;
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                String[] strArr = bwjh.a;
                bwjc bwjcVar = new bwjc(bwjh.a);
                bwjcVar.z("getUnredactedPhoneNumberPsbd");
                apply = new Function() { // from class: adum
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bwjg bwjgVar = (bwjg) obj;
                        bwjgVar.aq(new dtrx("pii_hash.hash_key", 6));
                        bwjgVar.aq(new dtrx("pii_hash.hash_value", 6));
                        return bwjgVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new bwjg());
                bwjcVar.k(new bwjf((bwjg) apply));
                bwir bwirVar = bwjh.c;
                bwis[] bwisVarArr = {bwirVar.d, bwirVar.c};
                int a = bwjh.b().a();
                Integer.valueOf(a).getClass();
                for (int i = 0; i < 2; i++) {
                    if (((Integer) bwjh.b.getOrDefault(bwisVarArr[i].toString(), -1)).intValue() > a) {
                        dtub.w("columnReference.toString()", a);
                    }
                }
                bwjcVar.m(bwisVarArr);
                bwit bwitVar = (bwit) bwjcVar.b().o();
                while (bwitVar.moveToNext()) {
                    try {
                        String c = bwitVar.c();
                        String e = bwitVar.e();
                        c.getClass();
                        e.getClass();
                        sb.append("original = ");
                        sb.append(c);
                        sb.append(", hashValue = ");
                        sb.append(e);
                        sb.append("\n");
                    } catch (Throwable th) {
                        try {
                            bwitVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bwitVar.close();
                if (TextUtils.isEmpty(sb.toString())) {
                    sb.append("No unredacted phone number.\n");
                }
                arrayList.add(new FileTeleporter(sb.toString().getBytes(), "unredacted_phone_number"));
                return arrayList;
            }
        }, this.b);
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl d() {
        return cfzj.d();
    }

    @Override // defpackage.adtw
    public final eoih e() {
        return eoih.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_UNREDACTED_PHONE_NUMBERS;
    }

    @Override // defpackage.adtw
    public final String f() {
        return this.a.getString(R.string.unredacted_phone_number_feedback_data_description);
    }

    @Override // defpackage.adtw
    public final String g() {
        return this.a.getString(R.string.unredacted_phone_number_feedback_data_detail_title);
    }

    @Override // defpackage.adtw
    public final String h() {
        return this.a.getString(R.string.unredacted_phone_number_feedback_data_name);
    }

    @Override // defpackage.adtw
    public final String i() {
        return this.a.getString(R.string.unredacted_phone_number_feedback_data_rationale);
    }

    @Override // defpackage.adtw
    public final String j() {
        return this.a.getString(R.string.unredacted_phone_number_feedback_data_rationale_title);
    }
}
