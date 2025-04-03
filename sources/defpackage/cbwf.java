package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbwf {
    public final bdhg a;
    public final emyl b;
    public final emyl c;
    public final MessageIdType d;

    public cbwf(final cbwc cbwcVar, final MessageIdType messageIdType, final bdhg bdhgVar) {
        this.a = bdhgVar;
        this.d = messageIdType;
        this.b = emys.a(new emyl() { // from class: cbwd
            @Override // defpackage.emyl
            public final Object get() {
                return cbwc.this.b(bdhgVar);
            }
        });
        this.c = emys.a(new emyl() { // from class: cbwe
            @Override // defpackage.emyl
            public final Object get() {
                return cbwc.this.a(messageIdType);
            }
        });
    }
}
