package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Formatter;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdc {
    public final Context e;
    private final emyl f = emys.a(new emyl() { // from class: acct
        @Override // defpackage.emyl
        public final Object get() {
            return new SimpleDateFormat("h:mm aa", Locale.US);
        }
    });
    public final emyl a = emys.a(new emyl() { // from class: accu
        @Override // defpackage.emyl
        public final Object get() {
            return new SimpleDateFormat("MMM d, h:mm aa", Locale.US);
        }
    });
    private final emyl g = emys.a(new emyl() { // from class: accv
        @Override // defpackage.emyl
        public final Object get() {
            return new SimpleDateFormat("EEE, MMM d, h:mm aa", Locale.US);
        }
    });
    private final emyl h = emys.a(new emyl() { // from class: accw
        @Override // defpackage.emyl
        public final Object get() {
            return new SimpleDateFormat("H:mm", Locale.US);
        }
    });
    public final emyl b = emys.a(new emyl() { // from class: accx
        @Override // defpackage.emyl
        public final Object get() {
            return new SimpleDateFormat("MMM d, H:mm", Locale.US);
        }
    });
    private final emyl i = emys.a(new emyl() { // from class: accy
        @Override // defpackage.emyl
        public final Object get() {
            return new SimpleDateFormat("EEE, MMM d, H:mm", Locale.US);
        }
    });
    public final emyl c = emys.a(new emyl() { // from class: accz
        @Override // defpackage.emyl
        public final Object get() {
            return new SimpleDateFormat("EEE, MMM d", Locale.US);
        }
    });
    public final emyl d = emys.a(new emyl() { // from class: acda
        @Override // defpackage.emyl
        public final Object get() {
            return new StringBuilder();
        }
    });
    private final emyl j = emys.a(new emyl() { // from class: acdb
        @Override // defpackage.emyl
        public final Object get() {
            return new Formatter((Appendable) acdc.this.d.get());
        }
    });

    public acdc(Context context) {
        this.e = context;
    }

    public final String a(Context context, long j, int i) {
        ((StringBuilder) this.d.get()).setLength(0);
        return DateUtils.formatDateRange(context, (Formatter) this.j.get(), j, j, i).toString();
    }

    public final String b(long j) {
        if (ctid.c(this.e).equals(Locale.US)) {
            return (DateFormat.is24HourFormat(this.e) ? (SimpleDateFormat) this.h.get() : (SimpleDateFormat) this.f.get()).format(Long.valueOf(j));
        }
        return a(this.e, j, 1);
    }

    public final String c(long j) {
        if (ctid.c(this.e).equals(Locale.US)) {
            return (DateFormat.is24HourFormat(this.e) ? (SimpleDateFormat) this.i.get() : (SimpleDateFormat) this.g.get()).format(Long.valueOf(j));
        }
        return a(this.e, j, 98323);
    }
}
