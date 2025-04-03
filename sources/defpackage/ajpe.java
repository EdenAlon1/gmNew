package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajpe extends ajpo {
    private final cuxh r;
    private final ayfg s;
    private final Optional t;
    private final engw u;

    public ajpe(Context context, cine cineVar, cthp cthpVar, ctia ctiaVar, cthz cthzVar, ffbr ffbrVar, cuxh cuxhVar, Optional optional, Optional optional2, Optional optional3, ayfg ayfgVar, cins cinsVar, List list, cwmm cwmmVar, List list2) {
        super(context, cthpVar, cinsVar, ctiaVar, cthzVar, ffbrVar, optional, optional2, list, cineVar, cwmmVar, "Multiple Reminders Triggered");
        this.r = cuxhVar;
        this.s = ayfgVar;
        this.t = optional3;
        this.u = engw.n(list2);
    }

    @Override // defpackage.cims, defpackage.cink
    public final String d() {
        return (String) this.t.map(new Function() { // from class: ajpd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ddjt.a(ajpe.this.b, null);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ajpo
    protected final List e() {
        ArrayList arrayList = new ArrayList();
        engw engwVar = this.u;
        int size = engwVar.size();
        for (int i = 0; i < size; i++) {
            ajpo ajpoVar = (ajpo) engwVar.get(i);
            String str = ajpoVar.o;
            if (str != null) {
                ajpoVar.l();
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // defpackage.ajpo
    protected final void g() {
        ayfg ayfgVar = this.s;
        this.l.g = ayfgVar.b(this.b);
    }

    @Override // defpackage.ajpo
    protected final void h() {
        kml kmlVar = this.l;
        kmlVar.l();
        kmlVar.u = "reminder_notification_group_key";
        kmlVar.v = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ajpo
    protected final void i() {
        kmt kmtVar = new kmt(this.l);
        String string = this.b.getString(R.string.enumeration_comma);
        ArrayList arrayList = new ArrayList();
        long j = 0;
        for (ajpn ajpnVar : this.k) {
            j = Math.max(ajpnVar.a(), j);
            String c = this.r.c(ajpnVar.f());
            String string2 = this.b.getResources().getString(R.string.reminder_notification_title_prefix, c);
            ctia ctiaVar = this.d;
            String g = ajpnVar.g();
            String c2 = ajpnVar.c();
            TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(ctiaVar.a, R.style.NotificationSenderText);
            TextAppearanceSpan textAppearanceSpan2 = new TextAppearanceSpan(ctiaVar.a, R.style.NotificationTertiaryText);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!TextUtils.isEmpty(string2)) {
                spannableStringBuilder.append((CharSequence) string2);
                spannableStringBuilder.setSpan(textAppearanceSpan, 0, string2.length(), 0);
            }
            String string3 = ctiaVar.a.getString(R.string.notification_separator);
            if (!TextUtils.isEmpty(g)) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) string3);
                }
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) g);
                spannableStringBuilder.setSpan(textAppearanceSpan2, length, g.length() + length, 0);
            }
            if (!TextUtils.isEmpty(c2) && !le.x(c2)) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) string3);
                }
                spannableStringBuilder.append(ctiaVar.b(null, c2));
            }
            kmtVar.g(spannableStringBuilder);
            if (c != null) {
                arrayList.add(c);
            }
        }
        this.m = this.b.getResources().getQuantityString(R.plurals.notification_new_reminders, this.k.size(), Integer.valueOf(this.k.size()));
        this.n = TextUtils.join(string, arrayList);
        kml kmlVar = this.l;
        kmlVar.i(this.m);
        kmlVar.h(this.n);
        kmlVar.y(j);
        this.l.w(this.d.a(((ajpo) this.u.get(0)).m, ((ajpo) this.u.get(0)).n, null));
    }

    @Override // defpackage.ajpo
    protected final boolean j() {
        return false;
    }

    @Override // defpackage.ajpo
    protected final void f() {
    }
}
