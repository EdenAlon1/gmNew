package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.CpmGroupManagement;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupData;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementDeserializer;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequestOrResponse;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djfc extends dkji {
    public final ListenableFuture a = kfg.a(new kfd() { // from class: djfa
        @Override // defpackage.kfd
        public final Object a(kfb kfbVar) {
            djfc.this.d = kfbVar;
            return "groupManagementOperation";
        }
    });
    public final UpdateGroupRequest b;
    public final String c;
    public kfb d;
    private final dkkj e;
    private final String f;
    private final errm g;
    private ListenableFuture h;
    private final djfw i;

    public djfc(errm errmVar, djfw djfwVar, UpdateGroupRequest updateGroupRequest, String str, String str2, dkkj dkkjVar) {
        this.b = updateGroupRequest;
        this.c = str;
        this.f = str2;
        this.e = dkkjVar;
        this.g = errmVar;
        this.i = djfwVar;
    }

    @Override // defpackage.dkji, defpackage.dkjz
    public final void a(dkjt dkjtVar, int i) {
        if (this.c.equals(dkjtVar.k)) {
            MessagingResult a = this.i.apply(this.e.S);
            ehyt ehytVar = new ehyt();
            ehytVar.b(this.b.b());
            ehytVar.c(a);
            r(ehytVar.a());
        }
    }

    @Override // defpackage.dkji, defpackage.dkjz
    public final void b(dkjt dkjtVar) {
        if (this.c.equals(dkjtVar.k)) {
            this.h = this.g.schedule(new Callable() { // from class: djfb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    djfc djfcVar = djfc.this;
                    dkty.q("Timeout while waiting for group management response for message: %s", djfcVar.c);
                    ehyt ehytVar = new ehyt();
                    ehytVar.b(djfcVar.b.b());
                    ehytVar.c(MessagingResult.g);
                    GroupOperationResult a = ehytVar.a();
                    djfcVar.r(a);
                    return a;
                }
            }, ((Long) djak.a().b.k.a()).longValue(), TimeUnit.SECONDS);
        }
    }

    @Override // defpackage.dkji, defpackage.dkjz
    public final void c(dkjt dkjtVar) {
        Optional d = ((Boolean) djfd.a.a()).booleanValue() ? d(dkjtVar) : q(dkjtVar);
        if (d.isEmpty()) {
            dkty.c("Not response of this message %s, ignore it.", this.f);
            return;
        }
        try {
            ListenableFuture listenableFuture = this.h;
            if (listenableFuture != null) {
                listenableFuture.cancel(true);
            }
            this.e.aU(this);
            Optional<GroupData> groupData = ((CpmGroupManagement) d.get()).getGroupData();
            if (!((Boolean) djfd.a.a()).booleanValue()) {
                if (groupData.isPresent() && groupData.get().getRequestOrResponse().getKind() == GroupManagementRequestOrResponse.Kind.RESPONSE) {
                    ehyt ehytVar = new ehyt();
                    ehytVar.b(this.b.b());
                    ehytVar.c(MessagingResult.d);
                    r(ehytVar.a());
                    return;
                }
                return;
            }
            if (groupData.isEmpty() || !GroupManagementRequestOrResponse.Kind.RESPONSE.equals(groupData.get().getRequestOrResponse().getKind())) {
                dkty.q("%s: Unexpected response to CpmGroupManagement request", this.c);
                ehyt ehytVar2 = new ehyt();
                ehytVar2.b(this.b.b());
                eibw d2 = MessagingResult.d();
                d2.c(15);
                ehytVar2.c(d2.e());
                r(ehytVar2.a());
                return;
            }
            int responseCode = groupData.get().getRequestOrResponse().response().getResponseCode();
            if (responseCode == 200) {
                ehyt ehytVar3 = new ehyt();
                ehytVar3.b(this.b.b());
                ehytVar3.c(MessagingResult.d);
                r(ehytVar3.a());
                return;
            }
            dkty.q("%s: CpmGroupManagement request failed with response code %d", this.c, Integer.valueOf(responseCode));
            ehyt ehytVar4 = new ehyt();
            ehytVar4.b(this.b.b());
            eibw d3 = MessagingResult.d();
            d3.c(15);
            ehytVar4.c(d3.e());
            r(ehytVar4.a());
        } catch (Throwable th) {
            this.e.aU(this);
            throw th;
        }
    }

    final Optional d(dkjt dkjtVar) {
        String str = dkjtVar.h;
        byte[] bArr = dkjtVar.f;
        if ("message/cpim".equals(str)) {
            try {
                eidf eidfVar = (eidf) eidw.a(dkjtVar.f);
                str = (String) eidfVar.c.f().orElse(str);
                bArr = ((eidh) eidfVar.c).a.I();
            } catch (IOException unused) {
                return Optional.empty();
            }
        }
        if (!GroupManagementContentType.CPM_GROUP_DATA_CONTENT_TYPE.g(str)) {
            return Optional.empty();
        }
        try {
            CpmGroupManagement parseCpmGroupManagement = GroupManagementDeserializer.parseCpmGroupManagement(bArr);
            return !this.f.equals(parseCpmGroupManagement.getMessageId()) ? Optional.empty() : Optional.of(parseCpmGroupManagement);
        } catch (IOException | XmlPullParserException e) {
            dkty.s(e, "Error parsing CpmGroupManagement message", new Object[0]);
            return Optional.empty();
        }
    }

    final Optional q(dkjt dkjtVar) {
        if (!GroupManagementContentType.CONTENT_TYPE.equals(dkjtVar.h)) {
            return Optional.empty();
        }
        try {
            CpmGroupManagement parseCpmGroupManagement = GroupManagementDeserializer.parseCpmGroupManagement(dkjtVar.f);
            return !this.f.equals(parseCpmGroupManagement.getMessageId()) ? Optional.empty() : Optional.of(parseCpmGroupManagement);
        } catch (IOException | XmlPullParserException e) {
            dkty.s(e, "Error parsing CpmGroupManagement message", new Object[0]);
            return Optional.empty();
        }
    }

    public final void r(GroupOperationResult groupOperationResult) {
        kfb kfbVar = this.d;
        kfbVar.getClass();
        kfbVar.b(groupOperationResult);
    }
}
