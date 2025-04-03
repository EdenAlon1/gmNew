package com.google.android.apps.messaging.shared.datamodel.data.common;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.aoku;
import defpackage.awui;
import defpackage.bdgr;
import defpackage.bdhg;
import defpackage.bdnn;
import defpackage.bdou;
import defpackage.buuo;
import defpackage.buxr;
import defpackage.byzg;
import defpackage.byzi;
import defpackage.byzl;
import defpackage.cfmh;
import defpackage.cjia;
import defpackage.cmjj;
import defpackage.cmlk;
import defpackage.cnbt;
import defpackage.cnmd;
import defpackage.cqtk;
import defpackage.csgg;
import defpackage.ecda;
import defpackage.engw;
import defpackage.eoxo;
import defpackage.fayv;
import defpackage.fjay;
import j$.time.Instant;
import j$.util.Optional;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface MessageCoreData extends Parcelable, bdou {
    bdgr A();

    MessageIdType B();

    MessageIdType C();

    bdhg D();

    bdhg E();

    bdnn F();

    MessagePartCoreData G();

    MessagePartCoreData I();

    MessagesTable.BindData J();

    buxr K();

    byzg L();

    byzg M();

    byzi N();

    byzl O();

    cfmh P();

    cjia Q();

    cmjj R();

    cmlk S();

    cnbt T();

    cnmd U();

    csgg V();

    ecda W();

    engw Y();

    engw Z();

    int a();

    String aA();

    String aB();

    String aC();

    String aD();

    String aE();

    List aH();

    UUID aI();

    fjay aJ();

    void aK(String str, Object obj);

    void aL(MessagePartCoreData messagePartCoreData);

    void aM(MessagesTable.BindData bindData);

    void aN(buuo buuoVar);

    void aO(SelfIdentityId selfIdentityId);

    void aP(SelfIdentityId selfIdentityId);

    void aQ(String str);

    void aR();

    void aS();

    void aT();

    void aU(long j);

    void aV(long j, cqtk cqtkVar);

    void aW(long j, cqtk cqtkVar);

    void aX(Instant instant);

    void aY(long j);

    void aZ(long j);

    fayv aa();

    Instant ac();

    Optional ad();

    Optional ae();

    Optional af();

    Optional ag();

    String ah();

    String ai();

    String aj();

    String ak();

    String al();

    String am();

    String an();

    String ao();

    String ap();

    String ar();

    String as();

    String at();

    String au();

    String av();

    String aw();

    String ay();

    String az();

    int b();

    void bA(Optional optional);

    void bB(boolean z);

    void bC();

    void bD(Uri uri);

    void bE(MessageUsageStatisticsData messageUsageStatisticsData);

    void bF(long j);

    void bG(String str);

    void bH(bdhg bdhgVar);

    void bI(byzg byzgVar);

    void bJ(byzg byzgVar);

    void bK(Instant instant);

    void bL(int i);

    void bM(long j);

    void bN(aoku aokuVar);

    void bO(cnmd cnmdVar);

    void bP(int i);

    void bQ(aoku aokuVar);

    void bR(long j);

    void bS(int i);

    void bT(String str);

    void bU(long j);

    void bV(int i);

    void bW(fjay fjayVar);

    void bX(long j);

    void bY(String str, List list);

    void bZ(MessagesTable.BindData bindData);

    void bb(long j);

    void bc(long j);

    void bd(long j);

    void be(long j);

    void bf(long j);

    void bg(long j);

    void bh();

    void bi(long j);

    void bj(long j);

    void bk(long j);

    void bl(long j);

    void bm(long j);

    void bn();

    void bo(bdnn bdnnVar);

    void bp(String str);

    void bq(String str);

    void br(csgg csggVar);

    void bs(fayv fayvVar);

    void bt(UUID uuid);

    void bu(cfmh cfmhVar);

    void bv(eoxo eoxoVar);

    void bw(cjia cjiaVar);

    void bx(boolean z);

    void by();

    void bz(boolean z);

    int c();

    boolean cA();

    boolean cB();

    boolean cC();

    boolean cD();

    boolean cE();

    boolean cF();

    boolean cG(long j);

    boolean cH(long j);

    boolean cI();

    boolean cK();

    boolean cN();

    boolean cO();

    boolean cP();

    boolean cR();

    boolean cS();

    boolean cV();

    boolean cW();

    boolean cX();

    boolean cY();

    boolean cZ();

    void ca(String str);

    void cb(byzl byzlVar);

    void cc();

    void cd(MessageIdType messageIdType);

    void ce(bdhg bdhgVar);

    void cf(ConversationIdType conversationIdType, Uri uri, long j);

    void cg();

    boolean ch();

    boolean ci();

    boolean cj();

    boolean ck();

    boolean cm();

    boolean co();

    boolean cp();

    boolean cq();

    boolean cr();

    boolean cs();

    boolean ct();

    boolean cu();

    boolean cv();

    boolean cw();

    boolean cy();

    boolean cz();

    int d();

    boolean da();

    boolean db();

    boolean dc();

    boolean dd();

    boolean de();

    boolean df();

    boolean dh();

    boolean di();

    boolean dk();

    byte[] dl();

    String dn(int i);

    /* renamed from: do */
    void mo253do();

    int f();

    int g();

    int h();

    int i();

    int j();

    int k();

    long l();

    long m();

    long n();

    long o();

    long p();

    long q();

    long r();

    long s();

    long t();

    Uri u();

    SelfIdentityId v();

    awui w();

    MessageCoreData x();

    MessageUsageStatisticsData y();

    ConversationIdType z();
}
