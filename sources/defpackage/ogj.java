package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogj extends ogo {
    public final ofz a;
    public final int b;
    public final int c;
    public final int d;

    public ogj(ofz ofzVar, int i, int i2, int i3) {
        this.a = ofzVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        if (ofzVar == ofz.a) {
            throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
        }
        if (a() <= 0) {
            throw new IllegalArgumentException("Drop count must be > 0, but was " + a());
        }
        if (i3 >= 0) {
            return;
        }
        throw new IllegalArgumentException("Invalid placeholdersRemaining " + i3);
    }

    public final int a() {
        return (this.c - this.b) + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogj)) {
            return false;
        }
        ogj ogjVar = (ogj) obj;
        return this.a == ogjVar.a && this.b == ogjVar.b && this.c == ogjVar.c && this.d == ogjVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String str;
        String c;
        int ordinal = this.a.ordinal();
        if (ordinal == 1) {
            str = "front";
        } else {
            if (ordinal != 2) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
            }
            str = ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME;
        }
        c = ffpc.c("PageEvent.Drop from the " + str + " (\n                    |   minPageOffset: " + this.b + "\n                    |   maxPageOffset: " + this.c + "\n                    |   placeholdersRemaining: " + this.d + "\n                    |)", "|");
        return c;
    }
}
