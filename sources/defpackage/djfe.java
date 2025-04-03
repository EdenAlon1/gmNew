package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementSerializer;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djfe extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;
    private final fbbm e;
    private final fbbm f;
    private final fbbm g;

    public djfe(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3, fbbm fbbmVar4, fbbm fbbmVar5, fbbm fbbmVar6) {
        super(fbbfVar2, new fbcd(djfe.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
        this.e = fbbz.c(fbbmVar4);
        this.f = fbbz.c(fbbmVar5);
        this.g = fbbz.c(fbbmVar6);
    }

    @Override // defpackage.fbbs
    public final /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        UpdateGroupRequest updateGroupRequest = (UpdateGroupRequest) list.get(0);
        djgw djgwVar = (djgw) list.get(1);
        djfv djfvVar = (djfv) list.get(2);
        ctvb ctvbVar = (ctvb) list.get(3);
        djfw djfwVar = (djfw) list.get(4);
        djff djffVar = (djff) list.get(5);
        int i = djfd.b;
        if (djgwVar.d().isEmpty()) {
            Optional map = djgwVar.c().map(djfwVar);
            eibw d = MessagingResult.d();
            d.c(16);
            MessagingResult messagingResult = (MessagingResult) map.orElse(d.e());
            ehyt ehytVar = new ehyt();
            ehytVar.c(messagingResult);
            ehytVar.b(updateGroupRequest.b());
            return erqt.i(ehytVar.a());
        }
        Object obj2 = djgwVar.d().get();
        String b = dktj.b();
        String l = Long.toString(new Random().nextInt(Alert.DURATION_SHOW_INDEFINITELY));
        if (updateGroupRequest.d().isEmpty()) {
            throw new IllegalArgumentException("Only subject modification allowed");
        }
        String str = (String) updateGroupRequest.d().get();
        byte[] createGroupSubjectDeleteXml = str.isEmpty() ? GroupManagementSerializer.createGroupSubjectDeleteXml(l) : GroupManagementSerializer.createGroupSubjectChangeXml(l, str);
        String o = dkut.o(((dkkq) ((dkha) obj2).i).r(), ctvbVar);
        eigi i2 = Message.i();
        i2.f(b);
        eidy eidyVar = new eidy();
        eidyVar.b(eyee.x(createGroupSubjectDeleteXml));
        eidyVar.c(ContentType.e(GroupManagementContentType.CONTENT_TYPE));
        i2.k(AutoOneOf_Message_MessageContent.a(eidyVar.a()));
        eieu eieuVar = new eieu();
        eieuVar.c(1);
        eieuVar.b(o);
        i2.i(eieuVar.a());
        dkjt b2 = djfvVar.b(updateGroupRequest.b(), i2.a(), Optional.empty(), eigz.MESSAGING_METHOD_CHAT);
        errm errmVar = (errm) ((fbbb) djffVar.a).a;
        djfw djfwVar2 = (djfw) djffVar.b.b();
        updateGroupRequest.getClass();
        l.getClass();
        dkkj dkkjVar = (dkkj) obj2;
        djfc djfcVar = new djfc(errmVar, djfwVar2, updateGroupRequest, b, l, dkkjVar);
        dkkjVar.aF(djfcVar);
        dkkjVar.aV(b2);
        return djfcVar.a;
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        fbbm fbbmVar = this.g;
        fbbm fbbmVar2 = this.f;
        fbbm fbbmVar3 = this.e;
        fbbm fbbmVar4 = this.d;
        return erqt.f(this.b.d(), this.c.d(), fbbmVar4.d(), fbbmVar3.d(), fbbmVar2.d(), fbbmVar.d());
    }
}
