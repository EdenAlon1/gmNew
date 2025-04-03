package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aeki;
import j$.util.Optional;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aeki {

    /* compiled from: PG */
    public interface a {
        ames H();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.aeki ai(final defpackage.afke r18, com.google.android.apps.messaging.label.data.classification.SuperSortLabel r19, defpackage.cqoh r20) {
        /*
            Method dump skipped, instructions count: 1013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeki.ai(afke, com.google.android.apps.messaging.label.data.classification.SuperSortLabel, cqoh):aeki");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.aeki aj(defpackage.bfkf r7) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeki.aj(bfkf):aeki");
    }

    private static emyl an(final ConversationIdType conversationIdType, final String str, final boolean z) {
        final a aVar = (a) ctba.a(a.class);
        return emys.a(new emyl() { // from class: aekf
            @Override // defpackage.emyl
            public final Object get() {
                return aeki.a.this.H().a(conversationIdType, str, z);
            }
        });
    }

    public abstract emyl A();

    public abstract fbwv B();

    public abstract Optional C();

    public abstract String D();

    public abstract String E();

    public abstract String F();

    public abstract String G();

    public abstract String H();

    public abstract String I();

    public abstract String J();

    public abstract String K();

    public abstract String L();

    public abstract String M();

    public abstract String N();

    public abstract String O();

    public abstract String P();

    public abstract String Q();

    public abstract String R();

    public abstract String S();

    public abstract String T();

    public abstract String U();

    public abstract String V();

    public abstract String W();

    public abstract Function X();

    public abstract boolean Y();

    public abstract boolean Z();

    public abstract int a();

    public abstract boolean aa();

    public abstract boolean ab();

    public abstract boolean ac();

    public abstract boolean ad();

    public abstract boolean ae();

    public abstract boolean af();

    public abstract boolean ag();

    public abstract boolean ah();

    public final String ak(String str) {
        Object apply;
        apply = X().apply(str);
        return (String) apply;
    }

    public final boolean al() {
        Uri q = ah() ? q() : r();
        return (q == null || Uri.EMPTY.equals(q)) ? false : true;
    }

    public final boolean am() {
        return !TextUtils.isEmpty(M()) && TextUtils.isEmpty(K()) && TextUtils.isEmpty(L());
    }

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract long l();

    public abstract long m();

    public abstract long n();

    public abstract long o();

    public abstract long p();

    public abstract Uri q();

    public abstract Uri r();

    public abstract SuperSortLabel s();

    public abstract amny t();

    public abstract ardn u();

    public abstract axcl v();

    public abstract ConversationIdType w();

    public abstract MessageIdType x();

    public abstract byyt y();

    public abstract ckte z();
}
