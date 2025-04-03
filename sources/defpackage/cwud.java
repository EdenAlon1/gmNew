package defpackage;

import android.content.Context;
import android.text.format.Formatter;
import com.google.android.apps.messaging.R;
import j$.util.DesugarArrays;
import j$.util.function.Predicate$CC;
import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwud extends cwuk {
    private final csuk a;
    private final ctyx b;

    public cwud(Context context, csuk csukVar, ctyx ctyxVar) {
        super(context);
        this.a = csukVar;
        this.b = ctyxVar;
    }

    static int b(int i) {
        float f = i;
        float f2 = 1.0f;
        while (f > 1024.0f) {
            f /= 1024.0f;
            f2 *= 1000.0f;
        }
        return (int) (f2 * f);
    }

    @Override // defpackage.cwuk
    protected final void a(int i) {
        String[] stringArray = this.i.getResources().getStringArray(R.array.rcs_mobile_data_auto_download_limit_entries);
        this.b.l(this.i.getString(R.string.rcs_mobile_data_auto_download_limit_pref_key), stringArray[i]);
        d();
    }

    @Override // defpackage.cwuk
    protected final void c() {
        Context context = this.i;
        ctyx ctyxVar = this.b;
        final String string = context.getString(R.string.rcs_mobile_data_auto_download_limit_disable_entry);
        String string2 = context.getString(R.string.rcs_mobile_data_auto_download_limit_default_entry);
        String f = ctyxVar.f(context.getString(R.string.rcs_mobile_data_auto_download_limit_pref_key), context.getString(R.string.rcs_mobile_data_auto_download_limit_default_entry));
        String[] stringArray = this.a.f() ? this.i.getResources().getStringArray(R.array.rcs_mobile_data_auto_download_limit_entries) : (String[]) DesugarArrays.stream(this.i.getResources().getStringArray(R.array.rcs_mobile_data_auto_download_limit_entries)).filter(new Predicate() { // from class: cwub
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
            public final boolean test(Object obj) {
                return !((String) obj).equals(string);
            }
        }).toArray(new IntFunction() { // from class: cwuc
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return new String[i];
            }
        });
        this.l = Arrays.asList(stringArray).indexOf(f);
        for (int i = 0; i < stringArray.length; i++) {
            String str = stringArray[i];
            if (str.equals(string)) {
                str = this.i.getString(R.string.rcs_mobile_data_auto_download_limit_disable_entry_text);
            } else if (!str.equals(string2)) {
                int parseInt = Integer.parseInt(str);
                if (parseInt != 0) {
                    str = Formatter.formatShortFileSize(this.i, parseInt);
                }
            } else if (this.a.f()) {
                str = this.i.getString(R.string.rcs_mobile_data_auto_download_carrier_format_entry, Formatter.formatShortFileSize(this.i, b(this.a.e())));
            } else {
                Context context2 = this.i;
                str = context2.getString(R.string.rcs_mobile_data_auto_download_carrier_format_entry, context2.getString(R.string.rcs_mobile_data_auto_download_limit_disable_entry_text));
            }
            stringArray[i] = str;
        }
        this.j = this.i.getString(R.string.set_rcs_mobile_data_auto_download_limit_title);
        this.k = stringArray;
        super.c();
    }
}
