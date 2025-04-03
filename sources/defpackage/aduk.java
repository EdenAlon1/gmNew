package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aduk implements adtw {
    public final bdtd a;
    private final errl b;
    private final Context c;

    public aduk(Context context, bdtd bdtdVar, errl errlVar) {
        this.c = context;
        this.a = bdtdVar;
        this.b = errlVar;
    }

    private final elfl k() {
        return elfo.g(new Callable() { // from class: adui
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List i = aduk.this.a.i();
                StringBuilder sb = new StringBuilder();
                enqv it = ((engw) i).iterator();
                while (it.hasNext()) {
                    aztg aztgVar = (aztg) it.next();
                    Optional map = aztgVar.b().map(new Function() { // from class: aduj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((aoku) obj).p(((Boolean) aoqm.d.e()).booleanValue());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    sb.append("SlotId: ");
                    sb.append(aztgVar.c());
                    sb.append("\tNormalizedNumber: ");
                    sb.append((String) map.orElse(null));
                    sb.append("\t\n");
                }
                ArrayList arrayList = new ArrayList();
                cfzc cfzcVar = new cfzc();
                cfzcVar.b("Self Number");
                cfzcVar.c(sb.toString());
                arrayList.add(cfzcVar.a());
                return arrayList;
            }
        }, this.b);
    }

    @Override // defpackage.adtw
    public final elfl a() {
        return k().h(new emwl() { // from class: aduh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                HashMap hashMap = new HashMap();
                for (cfzl cfzlVar : (List) obj) {
                    hashMap.put(cfzlVar.a(), cfzlVar.b());
                }
                return hashMap;
            }
        }, this.b);
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl b() {
        return cfzj.b();
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl c() {
        return cfzj.c();
    }

    @Override // defpackage.cfzm
    public final elfl d() {
        return k();
    }

    @Override // defpackage.adtw
    public final eoih e() {
        return eoih.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_SELF_PHONE_NUMBER;
    }

    @Override // defpackage.adtw
    public final String f() {
        return this.c.getString(R.string.self_phone_number_feedback_data_description);
    }

    @Override // defpackage.adtw
    public final String g() {
        return this.c.getString(R.string.self_phone_number_feedback_data_detail_title);
    }

    @Override // defpackage.adtw
    public final String h() {
        return this.c.getString(R.string.self_phone_number_feedback_data_name);
    }

    @Override // defpackage.adtw
    public final String i() {
        return this.c.getString(R.string.self_phone_number_feedback_data_rationale);
    }

    @Override // defpackage.adtw
    public final String j() {
        return this.c.getString(R.string.self_phone_number_feedback_data_rationale_title);
    }
}
