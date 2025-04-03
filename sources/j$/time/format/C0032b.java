package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalField;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: j$.time.format.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0032b extends B {
    final /* synthetic */ A e;

    C0032b(A a) {
        this.e = a;
    }

    @Override // j$.time.format.B
    public final String d(Chronology chronology, TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        return this.e.a(j, textStyle);
    }

    @Override // j$.time.format.B
    public final String e(TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        return this.e.a(j, textStyle);
    }

    @Override // j$.time.format.B
    public final Iterator f(Chronology chronology, TemporalField temporalField, TextStyle textStyle, Locale locale) {
        return this.e.b(textStyle);
    }

    @Override // j$.time.format.B
    public final Iterator g(TemporalField temporalField, TextStyle textStyle, Locale locale) {
        return this.e.b(textStyle);
    }
}
