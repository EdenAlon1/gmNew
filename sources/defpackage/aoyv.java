package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Comparator;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Comparator;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoyv implements aptd {
    public final aosh a;
    public final ffbr b;
    public final Context c;
    public final ffbr d;
    private final apnr e;
    private final enhk f;
    private final boolean g;
    private final aorw h;
    private final Optional i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;

    public aoyv(Context context, aosh aoshVar, ffbr ffbrVar, apnr apnrVar, enhk enhkVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, boolean z, aorw aorwVar, Optional optional) {
        this.c = context;
        this.a = aoshVar;
        this.b = ffbrVar;
        this.e = apnrVar;
        this.f = enhkVar;
        this.j = ffbrVar2;
        this.k = ffbrVar3;
        this.d = ffbrVar4;
        this.l = ffbrVar5;
        this.g = z;
        this.h = aorwVar;
        this.i = optional;
    }

    public final engw a(PartsTable.BindData[] bindDataArr, boolean z) {
        if (!this.g || bindDataArr.length < 2) {
            return engw.p(bindDataArr);
        }
        Comparator comparingInt = Comparator.CC.comparingInt(new ToIntFunction() { // from class: aoyr
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return Integer.parseInt(((PartsTable.BindData) obj).J());
            }
        });
        if (!z) {
            comparingInt = Comparator.EL.reversed(comparingInt);
        }
        Stream sorted = DesugarArrays.stream(bindDataArr).sorted(comparingInt);
        int i = engw.d;
        return (engw) sorted.collect(endq.a);
    }

    public final alxr b(MessagesTable.BindData bindData, ConversationId conversationId, int i, amfx amfxVar) {
        CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(bindData.D(), -1L);
        aoyo aoyoVar = aoyo.a;
        apni apniVar = new apni(i);
        apug apugVar = apug.n;
        int i2 = engw.d;
        return this.a.a(coreBugleMessageId, conversationId, amfxVar, bindData, aoyoVar, apniVar, apugVar, null, false, enou.a, new aoys());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0162, code lost:
    
        if (((defpackage.engw) j$.util.Collection.EL.stream(r6).filter(new defpackage.arap(r7)).collect(defpackage.endq.a)).size() == r2.size()) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0171, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016f, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016d, code lost:
    
        if (r5.a() == r2.size()) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x025a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0244  */
    @Override // defpackage.aptd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.engw c(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r28, defpackage.engw r29, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r30, defpackage.aoug r31, final defpackage.enhk r32, defpackage.apug r33, defpackage.amfx r34) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoyv.c(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, engw, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, aoug, enhk, apug, amfx):engw");
    }
}
