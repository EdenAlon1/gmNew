package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.rcsservice.chatsession.message.RichCardContainer;
import com.google.android.ims.rcsservice.chatsession.message.RichCardParser;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcse implements bcyh, bdou {
    public Long A;
    private final bcwz B;
    private final bdjs C;
    private final bzqa D;
    private final fazb E;
    private final ffbr F;
    private final cbwg G;
    private cbwf H;
    private boolean I;
    private boolean J;
    private boolean K;
    private cjia L;
    private final cbvv M;
    private final caao N;
    public bigm a;
    public bgmp b;
    public MessagesTable.BindData c;
    public ParticipantsTable.BindData d;
    public byul e;
    public ajqt f;
    public List g;
    public List h;
    public List i;
    public long j;
    public final ParticipantColor k;
    public final crji l;
    public final aolr m;
    public final ffbr n;
    public Optional o;
    public int p;
    public boolean q;
    public boolean r;
    public cmrf s;
    public SuperSortLabel t;
    public String u;
    public boolean v;
    public String w;
    public RepliedToDataAdapter x;
    public coiy y;
    public final fazb z;

    public bcse(crji crjiVar, bcwz bcwzVar, bdjs bdjsVar, bzqa bzqaVar, caao caaoVar, aolr aolrVar, fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2, cbwg cbwgVar, cbvv cbvvVar, fazb fazbVar2) {
        this.p = 0;
        this.A = null;
        this.l = crjiVar;
        this.B = bcwzVar;
        this.C = bdjsVar;
        this.D = bzqaVar;
        this.N = caaoVar;
        this.m = aolrVar;
        this.E = fazbVar;
        this.n = ffbrVar;
        this.F = ffbrVar2;
        this.G = cbwgVar;
        this.H = cbwgVar.a(bdhb.a, bdhg.a);
        this.M = cbvvVar;
        this.z = fazbVar2;
        this.k = new ParticipantColor();
        this.o = Optional.empty();
        String[] strArr = bjjn.a;
        this.a = new bigo().a();
        String[] strArr2 = MessagesTable.a;
        this.c = new buoz().a();
        String[] strArr3 = ParticipantsTable.a;
        this.d = new bvpp().a();
    }

    public static boolean aA(int i) {
        return i >= 100 && i <= 117;
    }

    public static boolean aB(bjjd bjjdVar) {
        return aA(bjjdVar.e());
    }

    public static boolean aN(int i) {
        return i == 3;
    }

    private static boolean bA(bjjd bjjdVar) {
        return bB(bjjdVar.n()) || bjjdVar.l().a > 0;
    }

    private static boolean bB(cmrf cmrfVar) {
        return (cmrfVar == null || cmrfVar.b.isEmpty()) ? false : true;
    }

    private static boolean bC(bifu bifuVar) {
        return aA(bifuVar.d());
    }

    private final MessagePartCoreData bj(eohh eohhVar) {
        return x(eohhVar, 0);
    }

    private final String bk(Context context) {
        StringBuilder sb = null;
        String str = null;
        boolean z = false;
        String str2 = null;
        for (MessagePartCoreData messagePartCoreData : this.g) {
            if (messagePartCoreData.aX()) {
                if (z) {
                    if (sb == null) {
                        sb = new StringBuilder();
                        if (!TextUtils.isEmpty(str2)) {
                            sb.append(str2);
                        }
                        str = au() ? context.getResources().getString(R.string.notification_dash_separator) : " ";
                    }
                    String W = messagePartCoreData.W();
                    if (!TextUtils.isEmpty(W)) {
                        if (!TextUtils.isEmpty(str) && sb.length() > 0) {
                            sb.append(str);
                        }
                        sb.append(W);
                    }
                } else {
                    str2 = messagePartCoreData.W();
                    z = true;
                }
            }
        }
        return sb == null ? str2 : sb.toString();
    }

    private final List bl(bgmp bgmpVar) {
        if (!((Boolean) ((cfup) shw.a.get()).e()).booleanValue()) {
            return bp(bgmpVar.aP);
        }
        List bp = bp(bgmpVar.aP);
        bu(bgmpVar.cj, bp);
        return bp;
    }

    private final List bm(bifu bifuVar) {
        return bl((bgmp) bifuVar.cO());
    }

    private final List bn(bigm bigmVar) {
        if (!((Boolean) ((cfup) shw.a.get()).e()).booleanValue()) {
            return bp(bigmVar.aL);
        }
        List bp = bp(bigmVar.aL);
        bu(bigmVar.cg, bp);
        return bp;
    }

    private final List bo(bjjd bjjdVar) {
        return bn((bigm) bjjdVar.cO());
    }

    private final List bp(PartsTable.BindData[] bindDataArr) {
        ArrayList arrayList = new ArrayList();
        for (PartsTable.BindData bindData : bindDataArr) {
            arrayList.add(this.B.e(bindData));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [ajra] */
    private final void bq(final bgmp bgmpVar) {
        bv();
        this.b = bgmpVar;
        this.c = bgmpVar.cI;
        ae();
        this.d = bgmpVar.bi;
        this.e = bgmpVar.bS;
        ajqr ajqrVar = null;
        if (!bgmpVar.cm.D().c()) {
            entd entdVar = ajqu.a;
            bgmpVar.getClass();
            if (bgmpVar.cm.D().c()) {
                ajqrVar = ajqr.a;
            } else {
                MessageIdType D = bgmpVar.cm.D();
                D.getClass();
                MessagesTable.BindData bindData = bgmpVar.cm;
                bindData.getClass();
                ParticipantsTable.BindData bindData2 = bgmpVar.ct;
                bindData2.getClass();
                ajqrVar = new ajra(D, bindData, bindData2, ffdx.b(bgmpVar.cz), bgmpVar.cF.s() != null ? bgmpVar.cF : null);
            }
        }
        this.f = ajqrVar;
        this.g = bl(bgmpVar);
        Stream map = DesugarArrays.stream(bgmpVar.bq).map(new Function() { // from class: bcry
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwuo bwuoVar = (bwuo) obj;
                return new bcsd(String.valueOf(bwuoVar.k()), bwuoVar.m(), bwuoVar.l(), bwuoVar.q());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        this.h = (List) map.collect(endq.a);
        this.i = (List) IntStream.CC.range(0, bgmpVar.bD.length).mapToObj(new IntFunction() { // from class: bcrz
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                bgmp bgmpVar2 = bgmpVar;
                bysc byscVar = bgmpVar2.bw[i2];
                ParticipantsTable.BindData bindData3 = bgmpVar2.bD[i2];
                if (i2 >= 0) {
                    String[] strArr = bgmpVar2.J;
                    if (i2 < strArr.length) {
                        String str = strArr[i2];
                        String[] strArr2 = bgmpVar2.K;
                        if (i2 >= strArr2.length) {
                            throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i2), Integer.valueOf(bgmpVar2.K.length)));
                        }
                        String str2 = strArr2[i2];
                        String[] strArr3 = bgmpVar2.L;
                        if (i2 >= strArr3.length) {
                            throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i2), Integer.valueOf(bgmpVar2.L.length)));
                        }
                        bcse bcseVar = bcse.this;
                        return new bcyy(byscVar.k(), str, bindData3.o() == 3, bcseVar.l.f(bcyy.d(str2), strArr3[i2], bcseVar.m.n(emxe.b(bindData3.U())), bcyy.e(bindData3)), byscVar.l());
                    }
                }
                throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i2), Integer.valueOf(bgmpVar2.J.length)));
            }
        }).collect(endq.a);
        bton btonVar = bgmpVar.bO;
        if (btonVar.s() != null && btonVar.k() > 0) {
            this.o = Optional.of(bgmpVar.bO);
        }
        bgmpVar.az(149, "reactions_data");
        this.s = bgmpVar.ca;
        bgmpVar.az(151, "message_id");
        this.v = !bgmpVar.cc.c();
        if (((Boolean) cjja.a.e()).booleanValue()) {
            bgmpVar.az(152, "sharing_state");
            this.L = bgmpVar.cd;
        }
        bgmpVar.az(177, "caption");
        this.w = bgmpVar.cH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    private final void br(bigm bigmVar) {
        ParticipantColor participantColor;
        bv();
        this.b = null;
        this.a = bigmVar;
        this.c = bigmVar.cF;
        ae();
        this.d = bigmVar.be;
        this.e = bigmVar.bP;
        this.f = bigmVar.cC.f().c() ? null : ajqu.a(bigmVar.cC);
        this.g = bn(bigmVar);
        this.h = new ArrayList();
        boph bophVar = bigmVar.bm;
        if (bophVar.f() != null) {
            for (int i = 0; i < bophVar.f().length; i++) {
                List list = this.h;
                long[] jArr = bophVar.c;
                if (i >= jArr.length) {
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i), Integer.valueOf(bophVar.c.length)));
                }
                String valueOf = String.valueOf(jArr[i]);
                long[] jArr2 = bophVar.d;
                if (i >= jArr2.length) {
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i), Integer.valueOf(bophVar.d.length)));
                }
                long j = jArr2[i];
                long[] jArr3 = bophVar.e;
                if (i >= jArr3.length) {
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i), Integer.valueOf(bophVar.e.length)));
                }
                long j2 = jArr3[i];
                Optional[] optionalArr = bophVar.f;
                if (i >= optionalArr.length) {
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i), Integer.valueOf(bophVar.f.length)));
                }
                list.add(new bcsd(valueOf, j, j2, optionalArr[i]));
            }
        }
        ?? r16 = 0;
        this.i = new ArrayList();
        bync byncVar = bigmVar.bA;
        if (byncVar.f() != null) {
            int length = byncVar.f().length;
            int i2 = 0;
            while (i2 < length) {
                List list2 = this.i;
                long[] jArr4 = byncVar.b;
                if (i2 >= jArr4.length) {
                    Integer valueOf2 = Integer.valueOf(i2);
                    Integer valueOf3 = Integer.valueOf(byncVar.b.length);
                    Object[] objArr = new Object[2];
                    objArr[r16] = valueOf2;
                    objArr[1] = valueOf3;
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", objArr));
                }
                long j3 = jArr4[i2];
                String[] strArr = byncVar.e;
                if (i2 >= strArr.length) {
                    Integer valueOf4 = Integer.valueOf(i2);
                    Integer valueOf5 = Integer.valueOf(byncVar.e.length);
                    Object[] objArr2 = new Object[2];
                    objArr2[r16] = valueOf4;
                    objArr2[1] = valueOf5;
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", objArr2));
                }
                String str = strArr[i2];
                boolean z = this.d.o() == 3 ? true : r16;
                crji crjiVar = this.l;
                String[] strArr2 = byncVar.f;
                if (i2 >= strArr2.length) {
                    Integer valueOf6 = Integer.valueOf(i2);
                    Integer valueOf7 = Integer.valueOf(byncVar.f.length);
                    Object[] objArr3 = new Object[2];
                    objArr3[r16] = valueOf6;
                    objArr3[1] = valueOf7;
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", objArr3));
                }
                Uri d = bcyy.d(strArr2[i2]);
                String[] strArr3 = byncVar.g;
                if (i2 >= strArr3.length) {
                    Integer valueOf8 = Integer.valueOf(i2);
                    Integer valueOf9 = Integer.valueOf(byncVar.g.length);
                    Object[] objArr4 = new Object[2];
                    objArr4[r16] = valueOf8;
                    objArr4[1] = valueOf9;
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", objArr4));
                }
                String h = bcyy.h(strArr3[i2]);
                aolr aolrVar = this.m;
                String[] strArr4 = byncVar.i;
                if (i2 >= strArr4.length) {
                    Integer valueOf10 = Integer.valueOf(i2);
                    Integer valueOf11 = Integer.valueOf(byncVar.i.length);
                    Object[] objArr5 = new Object[2];
                    objArr5[r16] = valueOf10;
                    objArr5[1] = valueOf11;
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", objArr5));
                }
                aoku n = aolrVar.n(strArr4[i2]);
                byncVar.az(9, "color_palette_index");
                int i3 = byncVar.j[i2];
                byncVar.az(10, "color_type");
                int i4 = byncVar.k[i2];
                if (i4 == 1) {
                    participantColor = new ParticipantColor(1, i3, 0);
                } else if (i4 != 2) {
                    int i5 = r16;
                    participantColor = new ParticipantColor(i5, i3, i5);
                } else {
                    byncVar.az(11, "extended_color");
                    participantColor = new ParticipantColor(2, -1, byncVar.l[i2]);
                }
                Uri f = crjiVar.f(d, h, n, participantColor);
                long[] jArr5 = byncVar.c;
                if (i2 >= jArr5.length) {
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i2), Integer.valueOf(byncVar.c.length)));
                }
                list2.add(new bcyy(j3, str, z, f, jArr5[i2]));
                i2++;
                r16 = 0;
            }
        }
        bton btonVar = bigmVar.bL;
        if (btonVar.s() != null && btonVar.k() > 0) {
            this.o = Optional.of(bigmVar.bL);
        }
        bigmVar.az(147, "reactions_data");
        this.s = bigmVar.bX;
        bigmVar.az(149, "message_id");
        this.v = !bigmVar.bZ.c();
        if (((Boolean) cjja.a.e()).booleanValue()) {
            bigmVar.az(150, "sharing_state");
            this.L = bigmVar.ca;
        }
        bigmVar.az(178, "caption");
        this.w = bigmVar.cE;
    }

    private final void bs(bifu bifuVar, boolean z) {
        SuperSortLabel superSortLabel;
        String str;
        bq((bgmp) bifuVar.cO());
        this.c.getClass();
        if (!z) {
            if (bifuVar.isFirst()) {
                this.I = false;
                this.q = true;
            } else if (bifuVar.moveToPrevious()) {
                this.I = bx(bifuVar, true);
                this.K = bz(bifuVar);
                this.q = Math.abs(i() - bifuVar.f()) >= 3600000;
                bifuVar.moveToNext();
            } else {
                this.I = false;
                this.q = false;
            }
            if (bifuVar.isLast() || !bifuVar.moveToNext()) {
                this.J = false;
            } else {
                this.J = bx(bifuVar, false);
                bifuVar.moveToPrevious();
            }
        }
        int i = bigl.a;
        if (aewg.h()) {
            emxf.b(bifuVar.dj("label_subquery_expression"), "ConversationMessagesQueries#getLabel: Conversation Labels enabled, but query did not include label expression");
            try {
                superSortLabel = SuperSortLabel.a(Integer.parseInt(bifuVar.dd("label_subquery_expression")));
            } catch (NumberFormatException unused) {
                superSortLabel = SuperSortLabel.UNKNOWN;
            }
        } else {
            superSortLabel = SuperSortLabel.UNKNOWN;
        }
        this.t = superSortLabel;
        if (aewg.h() && aewg.i()) {
            emxf.b(bifuVar.dj("intent_subquery_expression"), "ConversationMessagesQueries#getIntent: Conversation Labels enabled, but query did not include intent expression");
            str = bifuVar.dd("intent_subquery_expression");
        } else {
            str = "";
        }
        this.u = str;
        this.v = !bifuVar.i().c();
    }

    private final void bt(bjjd bjjdVar, boolean z) {
        SuperSortLabel superSortLabel;
        String str;
        br((bigm) bjjdVar.cO());
        if (!z) {
            if (bjjdVar.isFirst()) {
                this.I = false;
                this.q = true;
            } else if (bjjdVar.moveToPrevious()) {
                this.I = by(bjjdVar, true);
                this.K = bA(bjjdVar);
                this.q = Math.abs(i() - bjjdVar.g()) >= 3600000;
                bjjdVar.moveToNext();
            } else {
                this.I = false;
                this.q = false;
            }
            if (bjjdVar.isLast() || !bjjdVar.moveToNext()) {
                this.J = false;
            } else {
                this.J = by(bjjdVar, false);
                bjjdVar.moveToPrevious();
            }
        }
        int i = bigl.a;
        if (aewg.h()) {
            emxf.b(bjjdVar.dj("label_subquery_expression"), "ConversationMessagesQueries#getLabel: Conversation Labels enabled, but query did not include label expression");
            try {
                superSortLabel = SuperSortLabel.a(Integer.parseInt(bjjdVar.dd("label_subquery_expression")));
            } catch (NumberFormatException unused) {
                superSortLabel = SuperSortLabel.UNKNOWN;
            }
        } else {
            superSortLabel = SuperSortLabel.UNKNOWN;
        }
        this.t = superSortLabel;
        if (aewg.h() && aewg.i()) {
            emxf.b(bjjdVar.dj("intent_subquery_expression"), "ConversationMessagesQueries#getIntent: Conversation Labels enabled, but query did not include intent expression");
            str = bjjdVar.dd("intent_subquery_expression");
        } else {
            str = "";
        }
        this.u = str;
        this.v = !bjjdVar.l().c();
    }

    private static void bu(VmtTable.BindData[] bindDataArr, List list) {
        enhk enhkVar = (enhk) DesugarArrays.stream(bindDataArr).collect(endq.a(new Function() { // from class: bcsb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((VmtTable.BindData) obj).m();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Function$CC.identity()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            if (enhkVar.containsKey(messagePartCoreData.aa())) {
                messagePartCoreData.aM((VmtTable.BindData) enhkVar.get(messagePartCoreData.aa()));
            }
        }
    }

    private final void bv() {
        this.j = 0L;
        this.I = false;
        this.J = false;
        this.q = false;
        this.r = false;
        this.o = Optional.empty();
        this.s = null;
        this.x = null;
        String[] strArr = MessagesTable.a;
        this.c = new buoz().a();
        String[] strArr2 = ParticipantsTable.a;
        this.d = new bvpp().a();
    }

    private final boolean bw(bcse bcseVar, boolean z) {
        if (TextUtils.equals(this.c.X(), bcseVar.c.X()) && az() == bcseVar.az() && !aY() && !cbvv.h(bcseVar.f()) && Math.abs(i() - bcseVar.i()) <= 60000 && TextUtils.equals(aquz.b(s()), aquz.b(bcseVar.s())) && !au() && !bcseVar.au() && A() == bcseVar.A()) {
            return !(z && bcwd.a(bcseVar)) && bcseVar.x == null;
        }
        return false;
    }

    private final boolean bx(bifu bifuVar, boolean z) {
        if (!TextUtils.equals(this.c.X(), bifuVar.m())) {
            return false;
        }
        int d = bifuVar.d();
        if (az() != (d >= 100) || aY() || cbvv.h(d) || Math.abs(i() - bifuVar.e()) > 60000) {
            return false;
        }
        if (TextUtils.equals(aquz.b(s()), bifuVar.l()) && !au()) {
            int c = bifuVar.c();
            if (!bC(bifuVar) || !aN(c) || !MessagePartData.bE(bm(bifuVar))) {
                int c2 = bifuVar.c();
                if (!(bC(bifuVar) && aN(c2) && MessagePartData.bF(bm(bifuVar))) && A() == bifuVar.j()) {
                    return !(z && bz(bifuVar)) && bifuVar.h().c();
                }
                return false;
            }
        }
        return false;
    }

    private final boolean by(bjjd bjjdVar, boolean z) {
        if (!TextUtils.equals(this.c.X(), bjjdVar.r())) {
            return false;
        }
        int e = bjjdVar.e();
        if (az() != (e >= 100) || aY() || cbvv.h(e) || Math.abs(i() - bjjdVar.f()) > 60000) {
            return false;
        }
        if (TextUtils.equals(aquz.b(s()), bjjdVar.q()) && !au()) {
            int c = bjjdVar.c();
            if (!aB(bjjdVar) || !aN(c) || !MessagePartData.bE(bo(bjjdVar))) {
                int c2 = bjjdVar.c();
                if (!(aB(bjjdVar) && aN(c2) && MessagePartData.bF(bo(bjjdVar))) && A() == bjjdVar.m()) {
                    return !(z && bA(bjjdVar)) && bjjdVar.k().c();
                }
                return false;
            }
        }
        return false;
    }

    private static boolean bz(bifu bifuVar) {
        return bB(bifuVar.k()) || bifuVar.i().a > 0;
    }

    public final byzi A() {
        return this.c.K();
    }

    public final cjia B() {
        if (((Boolean) cjja.a.e()).booleanValue()) {
            return this.L;
        }
        return null;
    }

    public final Optional C() {
        return Optional.ofNullable(this.c.aa()).map(new Function() { // from class: bcrx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((fjay) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final String D(csrh csrhVar) {
        return csrhVar.c(i()).toString();
    }

    public final String E(csrh csrhVar) {
        return csrhVar.f(i(), false, false, true).toString();
    }

    public final String F(Resources resources) {
        String c = ((cpdg) this.E.b()).c(resources, H());
        return !TextUtils.isEmpty(c) ? resources.getString(R.string.message_fwd, c) : c;
    }

    public final String G() {
        return this.c.U();
    }

    public final String H() {
        return this.c.V();
    }

    public final String I() {
        return this.c.X();
    }

    public final String J(Context context) {
        return this.i != null ? bcyy.f(context.getResources(), this.i, this.c.W()) : "";
    }

    public final String K() {
        bgmp bgmpVar = this.b;
        return bgmpVar != null ? bgmpVar.h() : this.a.h();
    }

    public final String L() {
        bgmp bgmpVar = this.b;
        if (bgmpVar != null) {
            bgmpVar.az(146, "rcs_conference_uri");
            return bgmpVar.bX;
        }
        bigm bigmVar = this.a;
        bigmVar.az(144, "rcs_conference_uri");
        return bigmVar.bU;
    }

    public final String M() {
        bgmp bgmpVar = this.b;
        if (bgmpVar != null) {
            bgmpVar.az(145, "rcs_group_id");
            return bgmpVar.bW;
        }
        bigm bigmVar = this.a;
        bigmVar.az(143, "rcs_group_id");
        return bigmVar.bT;
    }

    public final String N() {
        return this.d.T();
    }

    @Deprecated
    public final String O() {
        return this.d.P();
    }

    public final String P(boolean z) {
        String R = R();
        if (!z || TextUtils.isEmpty(R)) {
            String Q = Q();
            if (!TextUtils.isEmpty(Q)) {
                return Q;
            }
            if (z || TextUtils.isEmpty(R)) {
                bgmp bgmpVar = this.b;
                String g = bgmpVar != null ? bgmpVar.g() : this.a.g();
                if (TextUtils.isEmpty(g)) {
                    return O();
                }
                return String.valueOf(bg()) + " " + cjze.a(g);
            }
        }
        return R;
    }

    public final String Q() {
        return this.d.Q();
    }

    public final String R() {
        return this.d.R();
    }

    @Override // defpackage.bcyh
    public final String S() {
        return this.d.U();
    }

    public final String T() {
        return this.c.Y();
    }

    public final String U() {
        Uri B = this.c.B();
        if (B == null) {
            return null;
        }
        return B.toString();
    }

    @Override // defpackage.bcyh
    public final String V(Context context) {
        if (this.i != null && aY()) {
            return this.M.d(this.i, f(), false, this.c.W(), this.c.X(), P(false), cbvv.g(f()) ? bk(context) : null, context);
        }
        String bk = bk(context);
        return (this.D.n() && MessageData.cl(f())) ? context.getResources().getString(this.N.a()) : bk;
    }

    public final String W() {
        return this.e.n();
    }

    public final String X() {
        return this.c.Z();
    }

    public final List Y() {
        return Z(null);
    }

    public final List Z(Predicate predicate) {
        boolean test;
        List<MessagePartCoreData> list = this.g;
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MessagePartCoreData messagePartCoreData : list) {
            if (messagePartCoreData.aZ()) {
                if (predicate != null) {
                    test = predicate.test(messagePartCoreData);
                    if (test) {
                    }
                }
                arrayList.add(messagePartCoreData);
            }
        }
        return arrayList;
    }

    public final int a(bcse bcseVar) {
        int compare = Long.compare(i(), bcseVar.i());
        return compare == 0 ? Long.compare(u().a, bcseVar.u().a) : compare;
    }

    public final boolean aC() {
        return bdjs.z(this.c.l());
    }

    public final boolean aD() {
        return this.c.l() == 2;
    }

    public final boolean aE(bcse bcseVar) {
        return a(bcseVar) > 0;
    }

    public final boolean aF() {
        int f = f();
        entd entdVar = MessageData.a;
        return f == 14;
    }

    public final boolean aG() {
        return az() && !as();
    }

    public final boolean aH(bcse bcseVar) {
        return a(bcseVar) < 0;
    }

    public final boolean aI() {
        int f = f();
        return (f == 8 || f == 19) && this.c.m() == 0 && bdjs.a(c());
    }

    public final boolean aJ() {
        int f;
        return this.c != null && (f = f()) > 0 && f <= 25;
    }

    public final boolean aK() {
        return f() == 18;
    }

    public final boolean aL() {
        if (as()) {
            return true;
        }
        for (MessagePartCoreData messagePartCoreData : this.g) {
            if (messagePartCoreData.aZ() && (messagePartCoreData.x() != null || messagePartCoreData.t() != null)) {
                return true;
            }
        }
        return false;
    }

    public final boolean aM() {
        MessagesTable.BindData bindData = this.c;
        bindData.getClass();
        return aN(bindData.l());
    }

    public final boolean aO() {
        if (!aA(f()) || !aN(this.c.l())) {
            return false;
        }
        List list = this.g;
        list.getClass();
        return MessagePartData.bE(list);
    }

    public final boolean aP() {
        if (!aA(f()) || !aN(this.c.l())) {
            return false;
        }
        List list = this.g;
        list.getClass();
        return MessagePartData.bF(list);
    }

    public final boolean aQ() {
        return f() == 16;
    }

    public final boolean aR() {
        cfva cfvaVar = aoqm.a;
        return ((Boolean) new aopr().get()).booleanValue() ? r().B() : az() && aM() && dktk.c(S());
    }

    public final boolean aS() {
        return this.d.ab();
    }

    public final boolean aT() {
        return bdjs.s(f());
    }

    public final boolean aU() {
        return bdjs.y(f());
    }

    public final boolean aV() {
        List list = this.g;
        if (list == null || list.size() != 1) {
            return false;
        }
        return ((MessagePartCoreData) this.g.get(0)).bo();
    }

    public final boolean aW() {
        List list = this.g;
        if (list == null || list.size() != 1) {
            return false;
        }
        return ((MessagePartCoreData) this.g.get(0)).bD();
    }

    public final boolean aX() {
        return bdjs.D(this.c.l());
    }

    public final boolean aY() {
        return cbvv.h(this.c.s());
    }

    public final boolean aZ() {
        return cbvw.a(this.c.s());
    }

    public final List aa() {
        ArrayList arrayList = new ArrayList(this.h.size());
        for (bcsd bcsdVar : this.h) {
            if (bcsdVar.d.isPresent()) {
                arrayList.add(bcsdVar);
            }
        }
        return arrayList;
    }

    @Override // defpackage.bdou
    public final List ab() {
        return this.g;
    }

    public final List ac() {
        ArrayList arrayList = new ArrayList(this.h.size());
        for (bcsd bcsdVar : this.h) {
            if (bcsdVar.c != 0) {
                arrayList.add(bcsdVar);
            }
        }
        return arrayList;
    }

    public final List ad() {
        MessagePartCoreData bj = bj(eohh.RICH_CARD);
        if (bj == null) {
            bj = bj(eohh.RICH_CARD_CAROUSEL);
        }
        if (bj == null || !RbmSpecificMessage.CONTENT_TYPE.equals(bj.V())) {
            return Collections.EMPTY_LIST;
        }
        RichCardContainer parse = new RichCardParser(bj.ae(), false).parse();
        return parse == null ? Collections.EMPTY_LIST : parse.getGeneralPurposeCards();
    }

    public final void ae() {
        this.H = this.G.a(this.c.D(), this.c.G());
    }

    public final boolean af() {
        if (aF() || bcwd.a(this) || this.x != null) {
            return false;
        }
        return this.J;
    }

    public final boolean ag() {
        if (!aF() && this.x == null) {
            return this.I;
        }
        return false;
    }

    public final boolean ah() {
        if (ao()) {
            return false;
        }
        return bdjs.y(f()) || bdjs.k(f());
    }

    public final boolean ai(Context context) {
        return !ao() && this.C.b(context, f());
    }

    public final boolean aj() {
        int f = f();
        bgmp bgmpVar = this.b;
        return bgmpVar != null ? bgmpVar.f() == 0 && !this.b.j() && this.C.c(this.b.cI.l(), f, this.b.cI.y(), this.b.k()) : this.a.f() == 0 && !this.a.j() && this.C.c(this.c.l(), f(), this.c.y(), this.a.k());
    }

    public final boolean ak() {
        bgmp bgmpVar = this.b;
        return bgmpVar != null ? bgmpVar.f() == 0 && !this.b.j() && this.C.d(this.c.l(), f(), this.c.y()) : this.a.f() == 0 && !this.a.j() && this.C.d(this.c.l(), f(), this.c.y());
    }

    public final boolean al() {
        cjia B = B();
        if ((!((Boolean) cjja.a.e()).booleanValue() || B == null || B.b != 104) && !ao()) {
            bdjs bdjsVar = this.C;
            int f = f();
            int c = c();
            if ((d() != 10003 || c != 1) && ((f == 8 || f == 19 || f == 12 || (bdjs.B(f) && bdjsVar.c.q())) && bdjs.a(c))) {
                return true;
            }
        }
        return false;
    }

    public final boolean am(Context context) {
        int c = c();
        if (c != 0) {
            if (c != 2) {
                if (c != 3) {
                    return false;
                }
                bgmp bgmpVar = this.b;
                if (bgmpVar != null) {
                    bgmpVar.az(150, "transfer_id");
                    if (bgmpVar.cb == null) {
                        return false;
                    }
                } else {
                    bigm bigmVar = this.a;
                    bigmVar.az(148, "transfer_id");
                    if (bigmVar.bY == null) {
                        return false;
                    }
                }
                if (!MessageData.cL(f()) && g() > 0) {
                    return false;
                }
            }
        } else {
            if (h() == -1) {
                return false;
            }
            if (!MessageData.cL(f()) && g() > 0) {
                return false;
            }
        }
        return this.C.e(context, f());
    }

    public final boolean an() {
        return aM() && b() == 0 && !ax();
    }

    public final boolean ao() {
        return Collection.EL.stream(this.g).anyMatch(new Predicate() { // from class: bcru
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
                return ((MessagePartCoreData) obj).be();
            }
        });
    }

    public final boolean ap() {
        return MessageData.cn(this.g);
    }

    public final boolean aq() {
        return this.j != 0;
    }

    public final boolean ar() {
        if (!aD()) {
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                if (((MessagePartCoreData) it.next()).aX()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean as() {
        return bdjs.k(f());
    }

    public final boolean at() {
        return bdjs.l(f());
    }

    public final boolean au() {
        return aO() || aP();
    }

    public final boolean av() {
        return this.c.n() == 2;
    }

    public final boolean aw() {
        return MessageData.cl(f());
    }

    public final boolean ax() {
        bgmp bgmpVar = this.b;
        return bgmpVar != null ? bgmpVar.j() : this.a.j();
    }

    public final boolean ay() {
        return this.c.ad();
    }

    @Override // defpackage.bcyh
    public final boolean az() {
        if (this.c == null) {
            return false;
        }
        return aA(f());
    }

    public final int b() {
        bgmp bgmpVar = this.b;
        return bgmpVar != null ? bgmpVar.f() : this.a.f();
    }

    public final boolean ba() {
        boolean z = ((Boolean) clei.a.e()).booleanValue() && bdjs.u(f());
        boolean x = bdjs.x(f());
        if (aM()) {
            return MessageData.cU(f()) || bdjs.s(f()) || bdjs.t(f()) || z || x;
        }
        return false;
    }

    public final boolean bb() {
        return this.c.r() == 130;
    }

    public final boolean bc() {
        int f = f();
        return (f == 8 || f == 19) && this.c.m() == 10004 && aM();
    }

    public final boolean bd() {
        return (((Boolean) cuye.b.e()).booleanValue() || this.r) ? false : true;
    }

    public final boolean be(bcse bcseVar) {
        boolean z;
        boolean z2 = this.J;
        if (bcseVar != null) {
            z = bw(bcseVar, false);
            this.J = z;
        } else {
            this.J = false;
            z = false;
        }
        return z2 != z;
    }

    public final boolean bf(bcse bcseVar) {
        boolean z = this.I;
        boolean z2 = this.K;
        boolean z3 = this.q;
        if (bcseVar == null) {
            this.K = false;
            this.I = false;
            this.q = true;
        } else {
            this.K = bcwd.a(bcseVar);
            this.I = bw(bcseVar, true);
            this.q = Math.abs(i() - bcseVar.i()) >= 3600000;
        }
        return ((Boolean) this.F.b()).booleanValue() ? (z == this.I && z2 == this.K && z3 == this.q) ? false : true : (z == this.I && z3 == this.q) ? false : true;
    }

    public final aokr bg() {
        return this.m.o(this.d).G();
    }

    public final void bh() {
        this.q = true;
    }

    public final void bi() {
        this.u = "";
    }

    @Override // defpackage.bcyh
    public final int c() {
        return this.c.l();
    }

    public final int d() {
        return this.c.m();
    }

    public final int e() {
        return this.c.q();
    }

    public final boolean equals(Object obj) {
        bgmp bgmpVar;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcse)) {
            return false;
        }
        bcse bcseVar = (bcse) obj;
        bigm bigmVar = this.a;
        if ((bigmVar != null && bigmVar.equals(bcsc.a) && bcseVar.a.equals(bcsc.a)) || ((bgmpVar = this.b) != null && bcseVar.b != null && bgmpVar.equals(bcsc.b) && bcseVar.b.equals(bcsc.b))) {
            return this.c.equals(bcseVar.c);
        }
        bgmp bgmpVar2 = this.b;
        if (bgmpVar2 == null) {
            return this.a.equals(bcseVar.a);
        }
        bgmp bgmpVar3 = bcseVar.b;
        if (bgmpVar3 != null) {
            return bgmpVar2.equals(bgmpVar3);
        }
        return false;
    }

    public final int f() {
        cbwf cbwfVar = this.H;
        cbwfVar.getClass();
        MessagesTable.BindData bindData = this.c;
        bindData.getClass();
        int s = bindData.s();
        Integer num = cbwfVar.a.k() ? (Integer) cbwfVar.b.get() : !cbwfVar.d.c() ? (Integer) cbwfVar.c.get() : null;
        return (num != null && (num.intValue() == 1 || num.intValue() == 2) && (num.intValue() > s || s == 4 || s == 5 || s == 6 || s == 7)) ? num.intValue() : s;
    }

    public final long g() {
        return this.c.u();
    }

    public final long h() {
        return this.c.v();
    }

    public final int hashCode() {
        bgmp bgmpVar = this.b;
        return bgmpVar != null ? bgmpVar.hashCode() : this.a.hashCode();
    }

    public final long i() {
        MessagesTable.BindData bindData = this.c;
        bindData.getClass();
        return bindData.w();
    }

    public final long j() {
        return this.d.u();
    }

    public final long k() {
        return this.c.y();
    }

    public final long l() {
        return this.c.z();
    }

    public final long m() {
        List list = this.g;
        long j = 0;
        if (list == null) {
            return 0L;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j += ((MessagePartCoreData) it.next()).p();
        }
        return j;
    }

    @Override // defpackage.bcyh
    public final long n() {
        return this.c.A();
    }

    public final Uri o() {
        ParticipantsTable.BindData bindData = this.d;
        if (bindData != null) {
            bindData.G();
        }
        return this.l.g(q(), R(), r(), this.k, aR(), aS(), this.d.Y());
    }

    public final Uri p() {
        long j = j();
        String N = N();
        if (j <= -1 || TextUtils.isEmpty(N)) {
            return null;
        }
        return ContactsContract.Contacts.getLookupUri(j, N);
    }

    public final Uri q() {
        return this.d.x();
    }

    public final aoku r() {
        return this.m.q(this.d);
    }

    public final SelfIdentityId s() {
        MessagesTable.BindData bindData = this.c;
        bindData.getClass();
        return aqvf.c(bindData.W());
    }

    @Override // defpackage.bcyh
    public final ConversationIdType t() {
        return this.c.C();
    }

    public final String toString() {
        return MessageData.aF(this.c.D(), this.c.l(), this.g);
    }

    public final MessageIdType u() {
        return this.c.D();
    }

    public final bdhg v() {
        return this.c.F();
    }

    public final bdhg w() {
        return this.c.G();
    }

    public final MessagePartCoreData x(eohh eohhVar, int i) {
        List<MessagePartCoreData> list = this.g;
        if (list != null && i >= 0) {
            for (MessagePartCoreData messagePartCoreData : list) {
                if (messagePartCoreData.N() == eohhVar && messagePartCoreData.a() == i) {
                    return messagePartCoreData;
                }
            }
        }
        return null;
    }

    public final MessagePartCoreData y(int i) {
        return x(eohh.RICH_CARD_MEDIA, i);
    }

    public final byzi z() {
        return this.d.D();
    }

    public bcse(crji crjiVar, bcwz bcwzVar, bdjs bdjsVar, bzqa bzqaVar, caao caaoVar, aolr aolrVar, fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2, cbwg cbwgVar, cbvv cbvvVar, fazb fazbVar2, MessageCoreData messageCoreData) {
        this(crjiVar, bcwzVar, bdjsVar, bzqaVar, caaoVar, aolrVar, fazbVar, ffbrVar, ffbrVar2, cbwgVar, cbvvVar, fazbVar2);
        bv();
        this.c = messageCoreData.J();
        this.g = ((MessageData) messageCoreData).i;
        this.H = cbwgVar.a(messageCoreData.B(), this.c.G());
    }

    public bcse(crji crjiVar, bcwz bcwzVar, bdjs bdjsVar, bzqa bzqaVar, caao caaoVar, aolr aolrVar, fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2, cbwg cbwgVar, cbvv cbvvVar, fazb fazbVar2, bgmp bgmpVar) {
        this(crjiVar, bcwzVar, bdjsVar, bzqaVar, caaoVar, aolrVar, fazbVar, ffbrVar, ffbrVar2, cbwgVar, cbvvVar, fazbVar2);
        bq(bgmpVar);
    }

    public bcse(crji crjiVar, bcwz bcwzVar, bdjs bdjsVar, bzqa bzqaVar, caao caaoVar, aolr aolrVar, fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2, cbwg cbwgVar, cbvv cbvvVar, fazb fazbVar2, bifu bifuVar) {
        this(crjiVar, bcwzVar, bdjsVar, bzqaVar, caaoVar, aolrVar, fazbVar, ffbrVar, ffbrVar2, cbwgVar, cbvvVar, fazbVar2);
        bs(bifuVar, false);
    }

    public bcse(crji crjiVar, bcwz bcwzVar, bdjs bdjsVar, bzqa bzqaVar, caao caaoVar, aolr aolrVar, fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2, cbwg cbwgVar, cbvv cbvvVar, fazb fazbVar2, bifu bifuVar, byte[] bArr) {
        this(crjiVar, bcwzVar, bdjsVar, bzqaVar, caaoVar, aolrVar, fazbVar, ffbrVar, ffbrVar2, cbwgVar, cbvvVar, fazbVar2);
        bs(bifuVar, true);
    }

    public bcse(crji crjiVar, bcwz bcwzVar, bdjs bdjsVar, bzqa bzqaVar, caao caaoVar, aolr aolrVar, fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2, cbwg cbwgVar, cbvv cbvvVar, fazb fazbVar2, bigm bigmVar) {
        this(crjiVar, bcwzVar, bdjsVar, bzqaVar, caaoVar, aolrVar, fazbVar, ffbrVar, ffbrVar2, cbwgVar, cbvvVar, fazbVar2);
        br(bigmVar);
    }

    public bcse(crji crjiVar, bcwz bcwzVar, bdjs bdjsVar, bzqa bzqaVar, caao caaoVar, aolr aolrVar, fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2, cbwg cbwgVar, cbvv cbvvVar, fazb fazbVar2, bjjd bjjdVar) {
        this(crjiVar, bcwzVar, bdjsVar, bzqaVar, caaoVar, aolrVar, fazbVar, ffbrVar, ffbrVar2, cbwgVar, cbvvVar, fazbVar2);
        bt(bjjdVar, false);
    }

    public bcse(crji crjiVar, bcwz bcwzVar, bdjs bdjsVar, bzqa bzqaVar, caao caaoVar, aolr aolrVar, fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2, cbwg cbwgVar, cbvv cbvvVar, fazb fazbVar2, bjjd bjjdVar, byte[] bArr) {
        this(crjiVar, bcwzVar, bdjsVar, bzqaVar, caaoVar, aolrVar, fazbVar, ffbrVar, ffbrVar2, cbwgVar, cbvvVar, fazbVar2);
        bt(bjjdVar, true);
    }

    public bcse(crji crjiVar, bcwz bcwzVar, bdjs bdjsVar, bzqa bzqaVar, caao caaoVar, aolr aolrVar, fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2, cbwg cbwgVar, cbvv cbvvVar, fazb fazbVar2, coiy coiyVar) {
        this(crjiVar, bcwzVar, bdjsVar, bzqaVar, caaoVar, aolrVar, fazbVar, ffbrVar, ffbrVar2, cbwgVar, cbvvVar, fazbVar2);
        bv();
        this.y = coiyVar;
        this.c = coiyVar.b();
        this.g = bp(coiyVar.f());
        this.b = null;
        String[] strArr = bjjn.a;
        this.a = new bigo().a();
        String[] strArr2 = ParticipantsTable.a;
        this.d = new bvpp().a();
        String[] strArr3 = byvy.a;
        this.e = new byuo().a();
        this.h = new ArrayList();
        this.i = new ArrayList();
    }
}
