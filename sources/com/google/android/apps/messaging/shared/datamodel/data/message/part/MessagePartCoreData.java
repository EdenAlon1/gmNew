package com.google.android.apps.messaging.shared.datamodel.data.message.part;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import defpackage.awap;
import defpackage.bdot;
import defpackage.bdov;
import defpackage.byyu;
import defpackage.byyz;
import defpackage.byza;
import defpackage.byzc;
import defpackage.drso;
import defpackage.dteh;
import defpackage.eohh;
import defpackage.eppr;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface MessagePartCoreData extends Parcelable, bdov {
    ConversationIdType A();

    MessageIdType B();

    bdot C();

    MessagePartCoreData D();

    PartsTable.BindData E();

    VmtTable.BindData F();

    byyu G();

    byyz H();

    byza I();

    byzc J();

    LocationInformation K();

    drso L();

    dteh M();

    eohh N();

    eppr O();

    String P();

    String Q();

    String R();

    String S();

    String T();

    String U();

    String W();

    String X();

    String Y();

    String Z();

    int a();

    void aA(byte[] bArr);

    void aB(byza byzaVar);

    void aC(drso drsoVar);

    void aD(Uri uri);

    void aE(Uri uri);

    void aF(long j);

    void aG(awap awapVar);

    void aH(byzc byzcVar);

    void aI(String str);

    void aJ(long j);

    void aK(String str);

    void aL(dteh dtehVar);

    void aM(VmtTable.BindData bindData);

    void aN(Context context);

    void aO(PartsTable.BindData bindData);

    void aP(ConversationIdType conversationIdType);

    void aQ(MessageIdType messageIdType);

    void aR(String str);

    void aS(MessagePartCoreData messagePartCoreData);

    boolean aT();

    boolean aU();

    boolean aV();

    boolean aW();

    boolean aX();

    boolean aY();

    String aa();

    String ab();

    String ac();

    String ad();

    String ae();

    void af();

    void ag();

    void ah();

    void ak();

    void al();

    void am(String str);

    void an(eppr epprVar);

    void ao(String str);

    void ap(long j);

    void aq(String str);

    void ar(long j);

    void as(byte[] bArr);

    void at(String str);

    void au(Uri uri);

    void av(ConversationIdType conversationIdType);

    void aw(long j);

    void ax(String str);

    void ay(Uri uri);

    void az(String str);

    boolean bA();

    boolean bB();

    boolean bC();

    boolean bD();

    boolean bG(Uri uri);

    boolean bH(MessagePartCoreData messagePartCoreData);

    byte[] bI();

    byte[] bJ();

    byte[] bK();

    byte[] bL();

    void bN();

    void bO();

    int bP();

    long bQ();

    boolean ba();

    boolean bb();

    boolean bc();

    boolean bd();

    boolean be();

    boolean bf();

    boolean bg();

    boolean bh();

    boolean bi();

    boolean bj();

    boolean bk();

    boolean bl();

    boolean bm();

    boolean bn();

    boolean bp();

    boolean bq();

    boolean br();

    boolean bs();

    boolean bt();

    boolean bu();

    boolean bv();

    boolean bw();

    boolean by();

    boolean bz();

    long d();

    long e();

    long k();

    long l();

    long m();

    long n();

    long o();

    long p();

    long q();

    ContentValues r();

    Rect s();

    Uri u();

    Uri v();

    Uri w();

    Uri x();

    awap z();
}
