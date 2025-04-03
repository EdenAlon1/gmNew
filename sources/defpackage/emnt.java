package defpackage;

import com.google.mediapipe.framework.MediaPipeException;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketGetter;
import com.google.mediapipe.framework.ProtoUtil;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emnt implements exnr {
    @Override // defpackage.exnr
    public final /* bridge */ /* synthetic */ exob a(List list) {
        try {
            Packet packet = (Packet) list.get(0);
            exna exnaVar = exna.a;
            ProtoUtil.SerializedMessage serializedMessage = new ProtoUtil.SerializedMessage();
            PacketGetter.nativeGetProto(packet.getNativeHandle(), serializedMessage);
            int i = ProtoUtil.b;
            String a = ProtoUtil.a(exnaVar.getClass());
            if (!serializedMessage.typeName.equals(a)) {
                throw new eygu("Message type does not match the expected type. Expected: " + a + " Got: " + serializedMessage.typeName);
            }
            exna exnaVar2 = (exna) exnaVar.getParserForType().l(serializedMessage.value, eyfc.a());
            ArrayList arrayList = new ArrayList();
            for (exnc exncVar : exnaVar2.c) {
                exlk exlkVar = exncVar.c;
                if (exlkVar == null) {
                    exlkVar = exlk.a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (exli exliVar : exlkVar.b) {
                    arrayList2.add(new exmt(exliVar.c, exliVar.b, exliVar.d, exliVar.e));
                }
                arrayList.add(new exmv(DesugarCollections.unmodifiableList(arrayList2), exncVar.d, (exncVar.b & 4) != 0 ? Optional.of(exncVar.e) : Optional.empty()));
            }
            return new emnq(new exmu(DesugarCollections.unmodifiableList(arrayList), (exnaVar2.b & 1) != 0 ? Optional.of(Long.valueOf(exnaVar2.d)) : Optional.empty()), ((Packet) list.get(0)).a());
        } catch (IOException e) {
            throw new MediaPipeException(exlp.INTERNAL.ordinal(), e.getMessage());
        }
    }

    @Override // defpackage.exnr
    public final /* bridge */ /* synthetic */ void b(List list) {
    }
}
