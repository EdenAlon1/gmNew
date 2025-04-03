package defpackage;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import androidx.car.app.model.Alert;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqnf implements TextWatcher {
    public final dqok a;
    public boolean c;
    private final ffsk e;
    private final ffji f;
    private final ffji g;
    private int h;
    private int i;
    public List b = new ArrayList();
    public ffsk d = a();
    private final List j = new ArrayList();
    private final List k = new ArrayList();

    public dqnf(ffsk ffskVar, dqok dqokVar, ffji ffjiVar, ffji ffjiVar2) {
        this.e = ffskVar;
        this.a = dqokVar;
        this.f = ffjiVar;
        this.g = ffjiVar2;
    }

    private final void d(CharSequence charSequence, ffjm ffjmVar) {
        ffqy.d(this.d, null, null, new dqne(this, charSequence.toString(), ffjmVar, null), 3);
    }

    public final ffsk a() {
        return ffsl.b(this.e.hT().plus(new ffuf(null)));
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
        int i = this.i;
        int i2 = this.h;
        if (i > 0) {
            int i3 = i2 + i;
            dqmm[] dqmmVarArr = (dqmm[]) editable.getSpans(i2, i3, dqmm.class);
            dqmmVarArr.getClass();
            if (dqmmVarArr.length == 0) {
                CharSequence d = lew.b().d(editable, i2, i3, Alert.DURATION_SHOW_INDEFINITELY, 1);
                d.getClass();
                Iterator a = ffjw.a(((Spannable) d).getSpans(i2, i3, lfb.class));
                while (a.hasNext()) {
                    Object obj = (lfb) a.next();
                    final int spanStart = editable.getSpanStart(obj);
                    final CharSequence subSequence = editable.subSequence(spanStart, editable.getSpanEnd(obj));
                    List list = this.k;
                    final ffji ffjiVar = new ffji() { // from class: dqmy
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            ffes ffesVar = (ffes) obj2;
                            ffesVar.getClass();
                            boolean z = false;
                            if (ffesVar.a == spanStart) {
                                if (ffkj.e(ffesVar.b, subSequence)) {
                                    z = true;
                                }
                            }
                            return Boolean.valueOf(z);
                        }
                    };
                    if (!Collection.EL.removeIf(list, new Predicate() { // from class: dqmz
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo439negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            return ((Boolean) ffji.this.invoke(obj2)).booleanValue();
                        }
                    })) {
                        d(subSequence, new dqnd(this));
                    }
                }
            } else {
                Iterator a2 = ffjw.a(dqmmVarArr);
                while (a2.hasNext()) {
                    dqmm dqmmVar = (dqmm) a2.next();
                    final int spanStart2 = editable.getSpanStart(dqmmVar);
                    final dqrp dqrpVar = dqmmVar.a;
                    List list2 = this.j;
                    final ffji ffjiVar2 = new ffji() { // from class: dqna
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            ffes ffesVar = (ffes) obj2;
                            ffesVar.getClass();
                            boolean z = false;
                            if (ffesVar.a == spanStart2) {
                                if (ffkj.e(ffesVar.b, dqrpVar)) {
                                    z = true;
                                }
                            }
                            return Boolean.valueOf(z);
                        }
                    };
                    if (!Collection.EL.removeIf(list2, new Predicate() { // from class: dqnb
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo439negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            return ((Boolean) ffji.this.invoke(obj2)).booleanValue();
                        }
                    })) {
                        b(this.b, dqmmVar.a);
                    }
                }
            }
        }
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            c(this.b, (dqrp) ((ffes) it.next()).b);
        }
        this.j.clear();
        Iterator it2 = this.k.iterator();
        while (it2.hasNext()) {
            d((CharSequence) ((ffes) it2.next()).b, new dqnc(this));
        }
        this.k.clear();
        this.c = false;
    }

    public final void b(List list, dqrp dqrpVar) {
        synchronized (list) {
            list.add(dqrpVar);
        }
        this.f.invoke(dqrpVar);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Object obj;
        charSequence.getClass();
        this.j.clear();
        this.k.clear();
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable == null || i2 <= 0 || this.c) {
            return;
        }
        int i4 = i2 + i;
        Iterator a = ffjw.a(spannable.getSpans(i, i4, dqmm.class));
        while (a.hasNext()) {
            dqmm dqmmVar = (dqmm) a.next();
            this.j.add(new ffes(spannable.getSpanStart(dqmmVar), dqmmVar.a));
        }
        Iterator a2 = ffjw.a(spannable.getSpans(i, i4, lfb.class));
        while (a2.hasNext()) {
            lfb lfbVar = (lfb) a2.next();
            int spanStart = spannable.getSpanStart(lfbVar);
            Iterator it = this.j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((ffes) obj).a == spanStart) {
                        break;
                    }
                }
            }
            if (obj == null) {
                this.k.add(new ffes(spanStart, spannable.subSequence(spanStart, spannable.getSpanEnd(lfbVar))));
            }
        }
    }

    public final void c(List list, dqrp dqrpVar) {
        synchronized (list) {
            list.remove(dqrpVar);
        }
        this.g.invoke(dqrpVar);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        this.h = i;
        this.i = i3;
    }
}
