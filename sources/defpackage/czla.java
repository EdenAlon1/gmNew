package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czla {
    public final MessageIdType a;
    public final StringBuilder b = new StringBuilder();
    public final SpannableStringBuilder c = new SpannableStringBuilder();
    private final crnx d;
    private final aolr e;

    public czla(crnx crnxVar, aolr aolrVar, MessageIdType messageIdType) {
        this.d = crnxVar;
        this.e = aolrVar;
        this.a = messageIdType;
    }

    public final void a(char c) {
        this.b.append(c);
        this.c.append(c);
    }

    public final void b(long j) {
        this.b.append(j);
        this.c.append((CharSequence) String.valueOf(j));
    }

    public final void c(String str) {
        this.b.append(str);
        if (str == null) {
            str = "null";
        }
        this.c.append((CharSequence) str);
    }

    public final void d(String str) {
        if (str == null) {
            this.b.append((String) null);
            return;
        }
        SpannableString a = this.d.a(this.e.n(str));
        this.c.append(a, a, 0);
        this.b.append((CharSequence) a);
    }
}
