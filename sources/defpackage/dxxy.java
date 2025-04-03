package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxxy {
    public final dwub a;
    public final emxc b;
    public final List c;

    public dxxy(dwub dwubVar, emxc emxcVar, List list) {
        this.a = dwubVar;
        this.b = emxcVar;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dwqb a(dwqb dwqbVar) {
        if ((dwqbVar.b & 1) != 0) {
            dwqa dwqaVar = dwqbVar.d;
            if (dwqaVar == null) {
                dwqaVar = dwqa.a;
            }
            if (!dwqaVar.b.isEmpty()) {
                dwqa dwqaVar2 = dwqbVar.d;
                if (dwqaVar2 == null) {
                    dwqaVar2 = dwqa.a;
                }
                String str = dwqaVar2.b;
                dwpu dwpuVar = (dwpu) dwqbVar.toBuilder();
                dwpuVar.copyOnWrite();
                ((dwqb) dwpuVar.instance).c = dwqb.emptyProtobufList();
                for (dwpy dwpyVar : dwqbVar.c) {
                    dwpj dwpjVar = dwpyVar.d;
                    if (dwpjVar == null) {
                        dwpjVar = dwpj.a;
                    }
                    dwpi dwpiVar = (dwpi) dwpjVar.toBuilder();
                    dwpiVar.copyOnWrite();
                    ((dwpj) dwpiVar.instance).g = dwpj.emptyProtobufList();
                    dwpj dwpjVar2 = dwpyVar.d;
                    if (dwpjVar2 == null) {
                        dwpjVar2 = dwpj.a;
                    }
                    for (dwph dwphVar : dwpjVar2.g) {
                        dwpe dwpeVar = (dwpe) dwphVar.toBuilder();
                        dwpeVar.copyOnWrite();
                        ((dwph) dwpeVar.instance).l = dwph.emptyProtobufList();
                        if (dwphVar.d.isEmpty()) {
                            String replace = str.replace("{checksum}", dwphVar.g);
                            dwpeVar.copyOnWrite();
                            dwph dwphVar2 = (dwph) dwpeVar.instance;
                            replace.getClass();
                            dwphVar2.b |= 2;
                            dwphVar2.d = replace;
                        }
                        for (dwpn dwpnVar : dwphVar.l) {
                            if (dwpnVar.c.isEmpty()) {
                                dwpk dwpkVar = (dwpk) dwpnVar.toBuilder();
                                String replace2 = str.replace("{checksum}", dwpnVar.e);
                                dwpkVar.copyOnWrite();
                                dwpn dwpnVar2 = (dwpn) dwpkVar.instance;
                                replace2.getClass();
                                dwpnVar2.b |= 1;
                                dwpnVar2.c = replace2;
                                dwpnVar = (dwpn) dwpkVar.build();
                            }
                            dwpeVar.copyOnWrite();
                            dwph dwphVar3 = (dwph) dwpeVar.instance;
                            dwpnVar.getClass();
                            eygr eygrVar = dwphVar3.l;
                            if (!eygrVar.c()) {
                                dwphVar3.l = eyfy.mutableCopy(eygrVar);
                            }
                            dwphVar3.l.add(dwpnVar);
                        }
                        dwpiVar.copyOnWrite();
                        dwpj dwpjVar3 = (dwpj) dwpiVar.instance;
                        dwph dwphVar4 = (dwph) dwpeVar.build();
                        dwphVar4.getClass();
                        dwpjVar3.a();
                        dwpjVar3.g.add(dwphVar4);
                    }
                    dwpv dwpvVar = (dwpv) dwpyVar.toBuilder();
                    dwpvVar.copyOnWrite();
                    dwpy dwpyVar2 = (dwpy) dwpvVar.instance;
                    dwpj dwpjVar4 = (dwpj) dwpiVar.build();
                    dwpjVar4.getClass();
                    dwpyVar2.d = dwpjVar4;
                    dwpyVar2.b |= 2;
                    dwpuVar.copyOnWrite();
                    dwqb dwqbVar2 = (dwqb) dwpuVar.instance;
                    dwpy dwpyVar3 = (dwpy) dwpvVar.build();
                    dwpyVar3.getClass();
                    eygr eygrVar2 = dwqbVar2.c;
                    if (!eygrVar2.c()) {
                        dwqbVar2.c = eyfy.mutableCopy(eygrVar2);
                    }
                    dwqbVar2.c.add(dwpyVar3);
                }
                return (dwqb) dwpuVar.build();
            }
        }
        Iterator<E> it = dwqbVar.c.iterator();
        while (it.hasNext()) {
            dwpj dwpjVar5 = ((dwpy) it.next()).d;
            if (dwpjVar5 == null) {
                dwpjVar5 = dwpj.a;
            }
            for (dwph dwphVar5 : dwpjVar5.g) {
                if (dwphVar5.d.isEmpty()) {
                    throw new IllegalArgumentException(String.format("DataFile %s url_to_download is missing.", dwphVar5.c));
                }
                Iterator<E> it2 = dwphVar5.l.iterator();
                while (it2.hasNext()) {
                    if (((dwpn) it2.next()).c.isEmpty()) {
                        throw new IllegalArgumentException(String.format("DeltaFile for file %s url_to_download is missing.", dwphVar5.c));
                    }
                }
            }
        }
        return dwqbVar;
    }

    public static final void b(ListenableFuture listenableFuture, String str, emxc emxcVar, emxc emxcVar2) {
        elfr.l(listenableFuture, new dxxx(str, emxcVar), erpp.a);
    }
}
