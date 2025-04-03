package defpackage;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmz {
    private final CharSequence a;
    private final long b;
    private final knr c;
    private final Bundle d = new Bundle();
    private String e;
    private Uri f;

    public kmz(CharSequence charSequence, long j, knr knrVar) {
        this.a = charSequence;
        this.b = j;
        this.c = knrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.util.List b(android.os.Parcelable[] r18) {
        /*
            r0 = r18
            java.lang.String r1 = "uri"
            java.lang.String r2 = "extras"
            java.lang.String r3 = "type"
            java.lang.String r4 = "sender"
            java.lang.String r5 = "sender_person"
            java.lang.String r6 = "person"
            java.lang.String r7 = "time"
            java.lang.String r8 = "text"
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = r0.length
            r9.<init>(r10)
            r10 = 0
        L19:
            int r11 = r0.length
            if (r10 >= r11) goto Lc5
            r11 = r0[r10]
            boolean r12 = r11 instanceof android.os.Bundle
            if (r12 == 0) goto Lb9
            android.os.Bundle r11 = (android.os.Bundle) r11
            r12 = 0
            boolean r13 = r11.containsKey(r8)     // Catch: java.lang.ClassCastException -> Laf
            if (r13 == 0) goto Laf
            boolean r13 = r11.containsKey(r7)     // Catch: java.lang.ClassCastException -> Laf
            if (r13 != 0) goto L33
            goto Laf
        L33:
            boolean r13 = r11.containsKey(r6)     // Catch: java.lang.ClassCastException -> Laf
            if (r13 == 0) goto L42
            android.os.Bundle r13 = r11.getBundle(r6)     // Catch: java.lang.ClassCastException -> Laf
            knr r13 = defpackage.knr.b(r13)     // Catch: java.lang.ClassCastException -> Laf
            goto L74
        L42:
            boolean r13 = r11.containsKey(r5)     // Catch: java.lang.ClassCastException -> Laf
            if (r13 == 0) goto L5b
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.ClassCastException -> Laf
            r14 = 28
            if (r13 < r14) goto L5b
            android.os.Parcelable r13 = r11.getParcelable(r5)     // Catch: java.lang.ClassCastException -> Laf
            android.app.Person r13 = defpackage.abj$$ExternalSyntheticApiModelOutline0.m(r13)     // Catch: java.lang.ClassCastException -> Laf
            knr r13 = defpackage.knp.b(r13)     // Catch: java.lang.ClassCastException -> Laf
            goto L74
        L5b:
            boolean r13 = r11.containsKey(r4)     // Catch: java.lang.ClassCastException -> Laf
            if (r13 == 0) goto L73
            knq r13 = new knq     // Catch: java.lang.ClassCastException -> Laf
            r13.<init>()     // Catch: java.lang.ClassCastException -> Laf
            java.lang.CharSequence r14 = r11.getCharSequence(r4)     // Catch: java.lang.ClassCastException -> Laf
            r13.a = r14     // Catch: java.lang.ClassCastException -> Laf
            knr r14 = new knr     // Catch: java.lang.ClassCastException -> Laf
            r14.<init>(r13)     // Catch: java.lang.ClassCastException -> Laf
            r13 = r14
            goto L74
        L73:
            r13 = r12
        L74:
            kmz r14 = new kmz     // Catch: java.lang.ClassCastException -> Laf
            java.lang.CharSequence r15 = r11.getCharSequence(r8)     // Catch: java.lang.ClassCastException -> Laf
            r16 = r4
            r17 = r5
            long r4 = r11.getLong(r7)     // Catch: java.lang.ClassCastException -> Lb3
            r14.<init>(r15, r4, r13)     // Catch: java.lang.ClassCastException -> Lb3
            boolean r4 = r11.containsKey(r3)     // Catch: java.lang.ClassCastException -> Lb3
            if (r4 == 0) goto L9e
            boolean r4 = r11.containsKey(r1)     // Catch: java.lang.ClassCastException -> Lb3
            if (r4 == 0) goto L9e
            java.lang.String r4 = r11.getString(r3)     // Catch: java.lang.ClassCastException -> Lb3
            android.os.Parcelable r5 = r11.getParcelable(r1)     // Catch: java.lang.ClassCastException -> Lb3
            android.net.Uri r5 = (android.net.Uri) r5     // Catch: java.lang.ClassCastException -> Lb3
            r14.d(r4, r5)     // Catch: java.lang.ClassCastException -> Lb3
        L9e:
            boolean r4 = r11.containsKey(r2)     // Catch: java.lang.ClassCastException -> Lb3
            if (r4 == 0) goto Lad
            android.os.Bundle r4 = r14.d     // Catch: java.lang.ClassCastException -> Lb3
            android.os.Bundle r5 = r11.getBundle(r2)     // Catch: java.lang.ClassCastException -> Lb3
            r4.putAll(r5)     // Catch: java.lang.ClassCastException -> Lb3
        Lad:
            r12 = r14
            goto Lb3
        Laf:
            r16 = r4
            r17 = r5
        Lb3:
            if (r12 == 0) goto Lbd
            r9.add(r12)
            goto Lbd
        Lb9:
            r16 = r4
            r17 = r5
        Lbd:
            int r10 = r10 + 1
            r4 = r16
            r5 = r17
            goto L19
        Lc5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kmz.b(android.os.Parcelable[]):java.util.List");
    }

    static Bundle[] c(List list) {
        Bundle[] bundleArr = new Bundle[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            kmz kmzVar = (kmz) list.get(i);
            Bundle bundle = new Bundle();
            CharSequence charSequence = kmzVar.a;
            if (charSequence != null) {
                bundle.putCharSequence(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, charSequence);
            }
            bundle.putLong("time", kmzVar.b);
            knr knrVar = kmzVar.c;
            if (knrVar != null) {
                bundle.putCharSequence("sender", knrVar.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", knp.a(kmzVar.c));
                } else {
                    bundle.putBundle("person", kmzVar.c.a());
                }
            }
            String str = kmzVar.e;
            if (str != null) {
                bundle.putString(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, str);
            }
            Uri uri = kmzVar.f;
            if (uri != null) {
                bundle.putParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            }
            bundle.putBundle("extras", kmzVar.d);
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    final Notification.MessagingStyle.Message a() {
        Notification.MessagingStyle.Message a;
        int i = Build.VERSION.SDK_INT;
        knr knrVar = this.c;
        if (i >= 28) {
            a = kmy.a(this.a, this.b, knrVar != null ? knp.a(knrVar) : null);
        } else {
            a = kmx.a(this.a, this.b, knrVar != null ? knrVar.a : null);
        }
        String str = this.e;
        if (str != null) {
            kmx.b(a, str, this.f);
        }
        return a;
    }

    public final void d(String str, Uri uri) {
        this.e = str;
        this.f = uri;
    }
}
